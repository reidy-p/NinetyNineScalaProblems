package NinetyNineScala

object P02 extends App{

  def penultimate[T](l: List[T]): T = l match {
    case a :: _ :: Nil => a
    case _ :: remainder => penultimate(remainder)
    case _ => throw new NoSuchElementException
  }

}
