package NinetyNineScala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import P20._

@RunWith(classOf[JUnitRunner])
class P20Tests extends FunSuite {

  test("List of chars with element in range") {
   assert(removeAt(1, List('a', 'b', 'c', 'd')) === (List('a', 'c', 'd'), 'b'))
  }

  test("List of chars with element outside range should throw NoSuchElementException") {
    assertThrows[NoSuchElementException] {
      removeAt(10, List('a', 'b', 'c', 'd')) === (List('a', 'c', 'd'), 'b')
    }
  }

}
