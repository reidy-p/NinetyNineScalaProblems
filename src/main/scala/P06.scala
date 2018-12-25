package NinetyNineScala
import P05._

object P06 extends App {

  def isPalindrome[T](ls: List[T]): Boolean = ls.equals(reverse(ls))

}
