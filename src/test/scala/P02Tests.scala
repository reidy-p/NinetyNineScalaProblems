package NinetyNineScala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import P02._

@RunWith(classOf[JUnitRunner])
class P02Tests extends FunSuite  {

  test("List of ints") {
    assert(penultimate(List(1, 1, 2, 3, 5, 8)) === 5)
  }

  test("List of chars") {
    assert(penultimate(List('a', 'b', 'c')) === 'b')
  }

  test("List with two elements should return first element") {
    assert(penultimate(List('a', 'b')) === 'a')
  }

  test("List with only one element should throw NoSuchElementException") {
    assertThrows[NoSuchElementException] {
      penultimate(List('a'))
    }
  }

  test("Empty List should throw NoSuchElementException") {
    assertThrows[NoSuchElementException] {
      penultimate(List())
    }
  }
}
