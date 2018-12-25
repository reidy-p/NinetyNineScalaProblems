package NinetyNineScala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import P05._

@RunWith(classOf[JUnitRunner])
class P05Tests extends FunSuite  {

  test("reverse a list of ints") {
    assert(reverse(List(1, 1, 2, 3, 5, 8)) === List(8, 5, 3, 2, 1, 1))
    assert(reverseTailRecursive(List(1, 1, 2, 3, 5, 8)) === List(8, 5, 3, 2, 1, 1))
    assert(reverseFunctional(List(1, 1, 2, 3, 5, 8)) === List(8, 5, 3, 2, 1, 1))
    assert(reverseFunctional2(List(1, 1, 2, 3, 5, 8)) === List(8, 5, 3, 2, 1, 1))
  }

  test("reverse a list of chars") {
    assert(reverse(List('a', 'b', 'c')) === List('c', 'b', 'a'))
    assert(reverseTailRecursive(List('a', 'b', 'c')) === List('c', 'b', 'a'))
    assert(reverseFunctional(List('a', 'b', 'c')) === List('c', 'b', 'a'))
    assert(reverseFunctional2(List('a', 'b', 'c')) === List('c', 'b', 'a'))
  }

  test("reversing a list of one element should return the list unchanged") {
    assert(reverse(List(1)) === List(1))
    assert(reverseTailRecursive(List(1)) === List(1))
    assert(reverseFunctional(List(1)) === List(1))
    assert(reverseFunctional2(List(1)) === List(1))
  }

  test("reversing an empty list should return an empty list") {
    assert(reverse(List()) === List())
    assert(reverseTailRecursive(List()) === List())
    assert(reverseFunctional(List()) === List())
    assert(reverseFunctional2(List()) === List())
  }
}
