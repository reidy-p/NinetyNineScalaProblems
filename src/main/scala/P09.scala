package NinetyNineScala

object P09 extends App {

  def pack[T](ls: List[T]): List[List[T]] = ls match {
    case Nil => Nil
    case head :: _ => {
      val (packed, rest) = ls.span(e => e == head)
      packed :: pack(rest)
    }
  }

  def pack2[T](ls: List[T]): List[List[T]] = {
    if (ls.isEmpty) Nil
    else {
      val (packed, rest) = ls.span(e => e == ls.head)
      packed :: pack2(rest)
    }
  }

}
