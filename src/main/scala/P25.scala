package NinetyNineScala
import P23.randomSelectRecursiveWithoutReplacement

object P25 extends App {

  def randomPermute[T](l: List[T]): List[T] = {
    randomSelectRecursiveWithoutReplacement(l.length, l)
  }

}
