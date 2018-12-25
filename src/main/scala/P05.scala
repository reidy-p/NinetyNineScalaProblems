package NinetyNineScala

object P05 extends App {

 def reverse[T](ls: List[T]): List[T] = ls match {
  case Nil => Nil
  case head :: tail => reverse(tail) ::: List(head)
 }

 def reverseTailRecursive[T](ls: List[T]): List[T] = {
  def reverseAux(result: List[T], currentList: List[T]): List[T] = currentList match {
   case Nil => result
   case head :: tail => reverseAux(head :: result, tail)
  }
  reverseAux(List(), ls)
 }

 def reverseFunctional[T](ls: List[T]): List[T] = {
  ls.foldLeft(List[T]()){ (acc, i) => i :: acc }
 }

 def reverseFunctional2[T](ls: List[T]): List[T] = {
  ls.foldRight(List[T]()){ (i, acc) => acc ::: List(i) }
 }

}
