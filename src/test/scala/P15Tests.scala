package NinetyNineScala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import P15._

@RunWith(classOf[JUnitRunner])
class P15Tests extends FunSuite {

  test("duplicateN on a list of chars") {
    val expected = List('a', 'a', 'b', 'b', 'c', 'c', 'c', 'c', 'd', 'd')
    assert(duplicateN(2, List('a', 'b', 'c', 'c', 'd')) === expected)
  }

  test("duplicateN on a list with one element") {
    assert(duplicateN(4, List('a')) === List('a', 'a', 'a', 'a'))
  }

  test("duplicateN on an empty list") {
    assert(duplicateN(4, List()) === List())
  }

}
