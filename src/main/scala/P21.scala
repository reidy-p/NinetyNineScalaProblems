package NinetyNineScala

object P21 extends App {

  def insertAt[T](e: T, n: Int, ls: List[T]): List[T] = {
    val (pre, post) = ls.splitAt(n)
    if (post.isEmpty) throw new NoSuchElementException
    else pre ::: List(e) ::: post
  }

  def insertAtRecursive[T](e: T, n: Int, ls: List[T]): List[T] = (n, ls) match {
    case (n, Nil) if (n > 0) => throw new NoSuchElementException
    case (0, post) => e :: post
    case (_, h :: tail) => h :: insertAtRecursive(e, n - 1, tail)
  }

}
