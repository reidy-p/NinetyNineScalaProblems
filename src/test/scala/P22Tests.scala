package NinetyNineScala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import P22._

@RunWith(classOf[JUnitRunner])
class P22Tests extends FunSuite {

  test("Range of ints") {
    assert(rangeRecursive(4, 9) === List(4, 5, 6, 7, 8, 9))
  }

  test("No overlap range of ints") {
    assert(rangeRecursive(9, 4) === List())
  }

  test("Range of ints including negative numbers") {
    assert(rangeRecursive(-4, 2) === List(-4, -3, -2, -1, 0, 1, 2))
    assert(rangeRecursive(-4, -2) === List(-4, -3, -2))
  }

  test("Start is equal to end") {
    assert(rangeRecursive(10, 10) === List(10))
    assert(rangeRecursive(-4, -4) === List(-4))
  }

}

