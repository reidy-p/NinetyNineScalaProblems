package NinetyNineScala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import P25._

@RunWith(classOf[JUnitRunner])
class P25Tests extends FunSuite {

  test("list of chars") {
    val input = List('a', 'b', 'c', 'd', 'e', 'f')
    assert(randomPermute(input).length === 6)
    assert(randomPermute(input).sorted === input)
  }

  test("list of negative numbers") {
    val input = List(-1, -3, -2)
    assert(randomPermute(input).length === 3)
    assert(randomPermute(input).sorted === input.sorted)
  }

  test("empty list") {
    val input = List()
    assert(randomPermute(input).length === 0)
    assert(randomPermute(input) === input)
  }
}
