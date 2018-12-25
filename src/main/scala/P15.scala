package NinetyNineScala

object P15 extends App {

  def duplicateN[T](n: Int, ls: List[T]): List[T] =
    ls.flatMap(x => List.fill(n)(x))

}
