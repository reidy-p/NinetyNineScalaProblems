package NinetyNineScala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import P03._

@RunWith(classOf[JUnitRunner])
class P03Tests extends FunSuite  {

  test("Third element of an int list of length 6") {
    assert(nth(2, List(1, 1, 2, 3, 5, 8)) == 2)
  }

  test("Seventh element of an int list of length 6 should throw NoSuchElementException") {
    assertThrows[NoSuchElementException] {
      nth(6, List(1, 1, 2, 3, 5, 8))
    }
  }

  test("First element of empty list should throw NoSuchElementException") {
    assertThrows[NoSuchElementException] {
      nth(0, List())
    }
  }

  test("Negative number should throw NoSuchElementException") {
    assertThrows[NoSuchElementException] {
      nth(-1, List(1, 2, 3))
    }
  }
}
