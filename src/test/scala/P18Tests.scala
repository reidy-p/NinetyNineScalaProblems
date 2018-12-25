package NinetyNineScala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import P18._

@RunWith(classOf[JUnitRunner])
class P18Tests extends FunSuite {

  test("slice on list of chars") {
    val expected = List('d', 'e', 'f', 'g')
    assert(slice(3, 7, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')) === expected)
    assert(sliceRecursive(3, 7, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')) === expected)
  }

  test("slice out of range should throw IndexOutOfBoundsException") {
    assertThrows[IndexOutOfBoundsException] {
      slice(3, 20, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
    }
    assertThrows[IndexOutOfBoundsException] {
      sliceRecursive(3, 20, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
    }
  }

  test("slice with end before start should throw IndexOutOfBoundsException") {
    assertThrows[IndexOutOfBoundsException] {
      slice(5, 2, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
    }
    assertThrows[IndexOutOfBoundsException] {
      sliceRecursive(5, 2, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
    }
  }

}
