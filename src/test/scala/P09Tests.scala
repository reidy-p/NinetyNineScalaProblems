package NinetyNineScala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import P09._

@RunWith(classOf[JUnitRunner])
class P09Tests extends FunSuite  {

  test("pack on a list of chars") {
   val expected = List(List('a', 'a'), List('b'), List('c', 'c'), List('a', 'a'), List('d'), List('e', 'e'))
   assert(pack(List('a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e')) === expected)
   assert(pack2(List('a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e')) === expected)
  }

  test("pack on a list with one element") {
    assert(pack(List('a')) === List(List('a')))
    assert(pack2(List('a')) === List(List('a')))
  }

  test("pack on an empty list") {
    assert(pack(List()) === List())
    assert(pack2(List()) === List())
  }
}

