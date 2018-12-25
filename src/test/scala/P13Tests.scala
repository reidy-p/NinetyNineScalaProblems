package NinetyNineScala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import P13._

@RunWith(classOf[JUnitRunner])
class P13Tests extends FunSuite {

  test("encode on a list of chars") {
    val expected = List((2, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (2, 'e'))
    assert(encodeDirect(List('a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e')) === expected)
  }

  test("encodeDirect on a list with one element") {
    assert(encodeDirect(List('a')) === List((1, 'a')))
  }

  test("encodeDirect on an empty list") {
    assert(encodeDirect(List()) === List())
  }

}
