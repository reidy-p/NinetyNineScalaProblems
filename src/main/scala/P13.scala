package NinetyNineScala

object P13 extends App {

  def encodeDirect[T](ls: List[T]): List[(Int, T)] = ls match {
    case Nil => Nil
    case _ => {
      val (packed, next) = ls.span(e => e == ls.head)
      (packed.length, ls.head) :: encodeDirect(next)
    }
  }

}
