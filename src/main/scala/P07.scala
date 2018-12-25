package NinetyNineScala

object P07 extends App {

  def flatten(ls: List[Any]): List[Any] = ls flatMap {
    case l: List[Any] => flatten(l)
    case e => List(e)
  }

}
