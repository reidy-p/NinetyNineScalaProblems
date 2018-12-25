package NinetyNineScala
import P09._

object P11 extends App {

  def encodeModified[T](ls: List[T]): List[Any] =
    pack(ls).map(l => if (l.length > 1) (l.length, l.head) else l.head)

}
