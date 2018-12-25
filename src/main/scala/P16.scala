package NinetyNineScala

object P16 extends App {

  def drop[T](n: Int, ls: List[T]): List[T] = {
    val (start, rest) = ls.splitAt(n - 1)
    if (start.isEmpty) Nil
    else if (rest.isEmpty) start
    else start ::: drop(n, rest.tail)
  }

  def dropRecursive[T](n: Int, ls: List[T]): List[T] = {
    def dropRecursiveAux[T](currentCount: Int, currentList: List[T]): List[T] =
      (currentCount, currentList) match {
        // Empty list (finish)
        case (_, Nil) => Nil
        // Ignore current element and start count again
        case (1, _ :: tail) => dropRecursiveAux(n, tail)
        // Include current element and lower count
        case (_, h :: tail) => h :: dropRecursiveAux(currentCount - 1, tail)
      }
    dropRecursiveAux(n, ls)
  }

}
