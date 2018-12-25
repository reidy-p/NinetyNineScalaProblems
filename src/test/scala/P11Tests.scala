package NinetyNineScala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import P11._

@RunWith(classOf[JUnitRunner])
class P11Tests extends FunSuite {

  test("encode on a list of chars") {
    val expected = List((2, 'a'), 'b', (2, 'c'), (2, 'a'), 'd', (2, 'e'))
    assert(encodeModified(List('a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e')) === expected)
  }

  test("encode on a list with one element") {
    assert(encodeModified(List('a')) === List('a'))
  }

  test("encode on an empty list") {
    assert(encodeModified(List()) === List())
  }

}
