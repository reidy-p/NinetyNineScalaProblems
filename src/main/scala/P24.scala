package NinetyNineScala
import P22.rangeRecursive
import P23.randomSelectRecursiveWithReplacement

object P24 extends App {

  def lotto(n: Int, to: Int): List[Int] = {
    val numbers = rangeRecursive(1, to)
    randomSelectRecursiveWithReplacement(n, numbers)
  }

}
