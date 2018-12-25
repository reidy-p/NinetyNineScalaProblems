package NinetyNineScala

object P01 extends App {

  def last[T](l: List[T]): T = l match {
    case h :: Nil => h
    case _ :: remainder => last(remainder)
    case _ => throw new NoSuchElementException
  }

}