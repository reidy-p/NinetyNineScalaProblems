package NinetyNineScala

object P26 extends App {

  def combinationsBuiltIn[T](n: Int, input: List[T]): List[List[T]] = input.combinations(n).toList

  def flatMapSublists[A, B](ls: List[A])(f: (List[A] => List[B])): List[B] = {
    ls match {
      case Nil => Nil
      case sublist@(_ :: tail) => f(sublist) ::: flatMapSublists(tail)(f)
    }
  }

  def combinations[A](n: Int, ls: List[A]): List[List[A]] = {
    if (n == 0) List(Nil)
    else flatMapSublists(ls) { sl =>
      combinations(n - 1, sl.tail) map {sl.head :: _}
    }
  }

  println(combinations(3, List('a', 'b', 'c', 'd')))
  println(flatMapSublists(List('a', 'b', 'c', 'd'))(l => l))
  println(flatMapSublists(List('a', 'b', 'c', 'd'))(l => l))

}
