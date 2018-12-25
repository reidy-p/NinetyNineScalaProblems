package NinetyNineScala

object P12 extends App {

  def decode[T](ls: List[(Int, T)]): List[T] = ls flatMap {
   case (i, c) => List.fill(i)(c)
  }

  println(decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))
}
