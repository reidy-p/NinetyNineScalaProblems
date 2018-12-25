package NinetyNineScala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import P12._

@RunWith(classOf[JUnitRunner])
class P12Tests extends FunSuite {

  test("encode on a list of chars") {
    val expected = List('a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e')
    assert(decode(List((2, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (2, 'e'))) === expected)
  }

  test("decode on a list with one element") {
    assert(decode(List((1, 'a'))) === List('a'))
  }

  test("decode on an empty list") {
    assert(decode(List()) === List())
  }

}
