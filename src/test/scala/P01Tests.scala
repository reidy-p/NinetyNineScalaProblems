package NinetyNineScala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import P01._

@RunWith(classOf[JUnitRunner])
class P01Tests extends FunSuite  {
  test("List of ints") {
    assert(last(List(1, 1, 2, 3, 5, 8)) === 8)
  }

  test("List with only one int should return the int") {
    assert(last(List(1)) === 1)
  }

  test("List of chars") {
    assert(last(List('a', 'b', 'c')) === 'c')
  }

  test("Calling last on empty List should produce NoSuchElementException") {
    assertThrows[NoSuchElementException] {
      last(List())
    }
  }
}
