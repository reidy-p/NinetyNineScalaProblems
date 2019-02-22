package NinetyNineScala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import P23._

@RunWith(classOf[JUnitRunner])
class P23Tests extends FunSuite {

  test("Positive number greater than zero") {
    assert(randomSelectRecursiveWithReplacement(3, List('a', 'b', 'c', 'd', 'f', 'g', 'h')).length === 3)
  }

  test("Zero should return empty list") {
    assert(randomSelectRecursiveWithReplacement(0, List('a', 'b', 'c', 'd', 'f', 'g', 'h')) === List())
  }

  test("Negative number should throw exception") {
    assertThrows[IndexOutOfBoundsException] {
      randomSelectRecursiveWithReplacement(-3, List('a', 'b', 'c', 'd', 'f', 'g', 'h'))
    }
  }

}
