package NinetyNineScala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import P06._

@RunWith(classOf[JUnitRunner])
class P06Tests extends FunSuite  {

 test("isPalindrome on a list of ints") {
  assert(isPalindrome(List(1, 1, 2, 2, 1, 1)))
  assert(!isPalindrome(List(1, 1, 2, 3, 5, 8)))
 }

 test("isPalindrome on a list of chars") {
  assert(isPalindrome(List('a', 'b', 'a')))
  assert(!isPalindrome(List('a', 'b', 'c')))
 }

 test("A list with one element is always a palindrome") {
  assert(isPalindrome(List(1)))
 }

 test("An empty list is always a palindrome") {
  assert(isPalindrome(List()))
 }

}
