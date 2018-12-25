package NinetyNineScala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import P04._

@RunWith(classOf[JUnitRunner])
class P04Tests extends FunSuite  {

  test("Length of list of ints") {
    assert(length(List(1, 1, 2, 3, 5, 8)) === 6)
    assert(lengthTailRecursive(List(1, 1, 2, 3, 5, 8)) === 6)
  }

  test("Length of list of chars") {
    assert(length(List('a', 'b', 'c')) === 3)
    assert(lengthTailRecursive(List('a', 'b', 'c')) === 3)
  }

  test("Length of empty list") {
    assert(length(List()) === 0)
    assert(lengthTailRecursive(List()) === 0)
  }

}
