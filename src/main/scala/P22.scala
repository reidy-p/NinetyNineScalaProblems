package NinetyNineScala

object P22 extends App {

  def rangeRecursive(from: Int, to: Int): List[Int] = {
    if (from <= to) from :: rangeRecursive(from + 1, to)
    else List()
  }

}
