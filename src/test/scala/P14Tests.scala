package NinetyNineScala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import P14._

@RunWith(classOf[JUnitRunner])
class P14Tests extends FunSuite {

  test("duplicate on a list of chars") {
    val expected = List('a', 'a', 'b', 'b', 'c', 'c', 'c', 'c', 'd', 'd')
    assert(duplicate(List('a', 'b', 'c', 'c', 'd')) === expected)
  }

  test("duplicate on a list with one element") {
    assert(duplicate(List('a')) === List('a', 'a'))
  }

  test("duplicate on an empty list") {
    assert(duplicate(List()) === List())
  }

}
