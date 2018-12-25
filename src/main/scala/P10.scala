package NinetyNineScala
import P09._

object P10 extends App {

  def encode[T](ls: List[T]): List[(Int, T)] = pack(ls).map(l => (l.length, l.head))

}
