package NinetyNineScala

object P20 extends App {

 def removeAt[T](n: Int, ls: List[T]): (List[T], T) =  {
  if (n > ls.length - 1) throw new NoSuchElementException
  else {
    val (head, tail) = ls.splitAt(n)
    (head ::: tail.tail, tail.head)
  }
 }

}
