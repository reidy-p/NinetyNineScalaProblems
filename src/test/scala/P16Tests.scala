package NinetyNineScala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import P16._

@RunWith(classOf[JUnitRunner])
class P16Tests extends FunSuite {

  test("drop every third element of a list of chars") {
    val expected = List('a', 'b', 'd','e', 'g', 'h', 'j', 'k')
    assert(drop(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')) === expected)
    assert(dropRecursive(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')) === expected)
  }

  test("drop every third element of a list with length 2") {
    val expected = List('a', 'b')
    assert(drop(3, List('a', 'b')) === expected)
    assert(dropRecursive(3, List('a', 'b')) === expected)
  }

  test("drop every second element of an empty list") {
    val expected = List()
    assert(drop(3, List()) === expected)
    assert(dropRecursive(3, List()) === expected)
  }

}
