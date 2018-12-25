package NinetyNineScala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import P19._

@RunWith(classOf[JUnitRunner])
class P19Tests extends FunSuite {

  test("List with small positive int (less than length of list)") {
    val expected = List('d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'a', 'b', 'c')
    assert(rotate(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')) === expected)
  }

  test("List with large positive int") {
    val expected = List('c', 'a', 'b')
    assert(rotate(50, List('a', 'b', 'c')) === expected)
  }

  test("List with small negative int (less than length of list)") {
    val expected = List('j', 'k', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i')
    assert(rotate(-2, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')) === expected)
  }

  test("List with large negative int") {
    val expected = List('c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'a', 'b')
    assert(rotate(-31, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')) === expected)
  }

}
