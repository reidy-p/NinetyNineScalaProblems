package NinetyNineScala

object P19 extends App {

 def rotate[T](n: Int, ls: List[T]): List[T] = {
   val i = if (n < 0) ls.length + (n % ls.length) else n % ls.length
   val (head, tail) = ls.splitAt(i)
   tail ::: head
 }

}
