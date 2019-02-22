package NinetyNineScala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import P21._

@RunWith(classOf[JUnitRunner])
class P21Tests extends FunSuite {

  test("List of chars with element in range") {
    assert(insertAt("new", 1, List('a', 'b', 'c', 'd')) === List('a', "new", 'b', 'c', 'd'))
    assert(insertAtRecursive("new", 1, List('a', 'b', 'c', 'd')) === List('a', "new", 'b', 'c', 'd'))
  }

  test("List of chars with element not in range should throw NoSuchElementException") {
    assertThrows[NoSuchElementException] {
      insertAt("new", 10, List('a', 'b', 'c', 'd'))
    }
    assertThrows[NoSuchElementException] {
      insertAtRecursive("new", 10, List('a', 'b', 'c', 'd'))
    }
  }

  test("Empty list should throw NoSuchElementException") {
    assertThrows[NoSuchElementException] {
      insertAt("new", 10, List())
    }
    assertThrows[NoSuchElementException] {
      insertAtRecursive("new", 10, List())
    }
  }

}
