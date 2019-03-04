package NinetyNineScala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import arithmetic.S99Int._

@RunWith(classOf[JUnitRunner])
class P31P41Tests extends FunSuite {

  test("isPrime should correctly determine whether an integer is prime") {
    assert(2.isPrime)
    assert(3.isPrime)
    assert(!1.isPrime)
    assert(!4.isPrime)
    assert(13.isPrime)
  }

  test("gcd should correctly find the greatest common divisor of two numbers") {
    assert(gcdEuclid(36, 63) == 9)
    assert(gcdEuclidImproved(36, 63) == 9)
    assert(gcdEuclid(13, 7) == 1)
    assert(gcdEuclidImproved(13, 7) == 1)
  }

  test("isCoprimeTo should only be true if the greatest common divisor is 1") {
    assert(13.isCoprimeTo(7))
    assert(35.isCoprimeTo(64))
    assert(!10.isCoprimeTo(5))
  }

  test("totient should calculate the correct number of positive integers that are coprime to m") {
    assert(10.totient == 4)
    assert(11.totient == 10)
    assert(10.totientImproved == 4)
    assert(11.totientImproved == 10)
  }

  test("primeFactors should return a list of prime factors in ascending order") {
    assert(315.primeFactors == List(3, 3, 5, 7))
    assert(10.primeFactors == List(2, 5))
    assert(1.primeFactors == List())
    assert(2.primeFactors == List(2))
  }

  test("primeFactorsMultiplicity should return a list of prime factors in ascending order") {
    assert(315.primeFactorsMultiplicity == Map(3 -> 2, 5 -> 1, 7 -> 1))
    assert(10.primeFactorsMultiplicity == Map(2 -> 1, 5 -> 1))
    assert(1.primeFactorsMultiplicity == Map())
    assert(2.primeFactorsMultiplicity == Map(2 -> 1))
  }

  test("listPrimesinRange should construct a list of primes in a range") {
    assert(listPrimesInRange(7 to 31) === List(7, 11, 13, 17, 19, 23, 29, 31))
  }

  test("goldbach should find the two prime numbers that when summed equal a given positive, even Int") {
    assert(4.goldbachInefficient === (2, 2))
    assert(4.golbachEfficient === (2, 2))
    assert(28.goldbachInefficient === (5, 23))
    assert(28.golbachEfficient  === (5, 23))
    assert(100.goldbachInefficient === (3, 97))
    assert(100.golbachEfficient   === (3, 97))
  }

}
