package NinetyNineScala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import P08._

@RunWith(classOf[JUnitRunner])
class P08Tests extends FunSuite  {

  test("compress on a list of chars") {
   assert(compress(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e', 'e')) === List('a', 'b', 'c', 'a', 'd', 'e'))
   assert(compressFoldLeft(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e', 'e')) === List('a', 'b', 'c', 'a', 'd', 'e'))
   assert(compressFoldRight(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e', 'e')) === List('a', 'b', 'c', 'a', 'd', 'e'))
  }

  test("compress on a list with one element should return the same list") {
    assert(compress(List('a')) === List('a'))
    assert(compressFoldLeft(List('a')) === List('a'))
    assert(compressFoldRight(List('a')) === List('a'))
  }

  test("compress on an empty list return the empty list") {
    assert(compress(List()) === List())
    assert(compressFoldLeft(List()) === List())
    assert(compressFoldRight(List()) === List())
  }
}
