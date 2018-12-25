package NinetyNineScala

object P14 extends App {

  def duplicate[T](ls: List[T]): List[T] =
    ls.flatMap(x => List.fill(2)(x))

}
