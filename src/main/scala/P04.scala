package NinetyNineScala

object P04 extends App {

  def length[T](ls: List[T]): Int = ls match {
    case Nil => 0
    case _ :: tail => 1 + length(tail)
  }

  def lengthTailRecursive[T](ls: List[T]): Int = {
    def lengthAux(result: Int, currentList: List[T]): Int = currentList match {
      case Nil => result
      case _ :: tail => lengthAux(result + 1, tail)
    }
    lengthAux(0, ls)
  }

}
