package NinetyNineScala

object P23 extends App {

  def randomSelectRecursiveWithReplacement[T](n: Int, input: List[T]): List[T] = {
    if (n > 0) {
      import scala.util.Random
      val (_, randomElement) = P20.removeAt(Random.nextInt(input.length - 1), input)
      randomElement :: randomSelectRecursiveWithReplacement(n - 1, input)
    }
    else if (n == 0) Nil
    else throw new IndexOutOfBoundsException
  }

}
