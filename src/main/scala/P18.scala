package NinetyNineScala

object P18 extends App {

  def slice[T](i: Int, k: Int, ls: List[T]): List[T] =
    if (k < i) throw new IndexOutOfBoundsException
    else if (k > ls.length) throw new IndexOutOfBoundsException
    else ls.drop(i).take(k - i)

  def sliceRecursive[T](i: Int, k: Int, ls: List[T]): List[T] =
    if (k < i) throw new IndexOutOfBoundsException
    else (i, k, ls) match {
      // Don't start yet
      case (a, _, _ :: tail) if (a > 0) => sliceRecursive(i - 1, k - 1, tail)
      // Start and continue gathering
      case (0, b, h :: tail) if (b > 0) => h :: sliceRecursive(0, k - 1, tail)
      // Finish
      case (0, 0, _) => Nil
      // Can't complete
      case (_, _, Nil) => throw new IndexOutOfBoundsException
    }

}
