package NinetyNineScala

object P08 extends App {

  def compress[T](ls: List[T]): List[T] = ls match {
    case Nil => Nil
    case a :: _ => a :: compress(ls.span(e => e == a)._2)
  }

  def compressFoldLeft[T](ls: List[T]): List[T] =
    ls.foldLeft(List[T]()){ (acc, i) =>
      if (acc.isEmpty || i != acc.head) i :: acc
      else acc
    }.reverse

  def compressFoldRight[T](ls: List[T]): List[T] =
    ls.foldRight(List[T]()){ (i, acc) =>
      if (acc.isEmpty || i != acc.head) i :: acc
      else acc
    }

}
