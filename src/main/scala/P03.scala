package NinetyNineScala

object P03 extends App {

  def nth[T](n: Int, ls: List[T]): T = {
    if (n < 0) throw new NoSuchElementException
    else ls match {
      case Nil => throw new NoSuchElementException
      case head :: _ if (n == 0) => head
      case _ :: tail => nth(n - 1, tail)
    }
  }

}
