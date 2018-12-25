package NinetyNineScala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import P10._

@RunWith(classOf[JUnitRunner])
class P10Tests extends FunSuite {

  test("encode on a list of chars") {
    val expected = List((2, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (2, 'e'))
    assert(encode(List('a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e')) === expected)
  }

  test("encode on a list with one element") {
    assert(encode(List('a')) === List((1, 'a')))
  }

  test("encode on an empty list") {
    assert(encode(List()) === List())
  }

}
