package NinetyNineScala

object P17 extends App {

  def split[T](n: Int, ls: List[T]): (List[T], List[T]) = ls.splitAt(n)

  def splitRecursive[T](n: Int, ls: List[T]): (List[T], List[T]) =
      (n, ls) match {
        case (_, Nil) => (Nil, Nil)
        case (1, h :: tail) => (List(h), tail)
        case (_, h :: _) => {
          val (pre, post) = splitRecursive(n - 1, ls.tail)
          (h :: pre, post)
        }
    }

}
