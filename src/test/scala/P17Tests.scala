package NinetyNineScala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import P17._

@RunWith(classOf[JUnitRunner])
class P17Tests extends FunSuite {

  test("split on list of chars") {
    val expected = (List('a', 'b', 'c'), List('d', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
    assert(split(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')) === expected)
    assert(splitRecursive(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')) === expected)
  }

  test("split out of range should return (list, Nil)") {
    val expected = (List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'), List())
    assert(split(30, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')) === expected)
    assert(splitRecursive(30, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')) === expected)
  }

}
