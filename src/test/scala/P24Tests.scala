package NinetyNineScala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import P24._

@RunWith(classOf[JUnitRunner])
class P24Tests extends FunSuite {

  test("list of positive numbers") {
    assert(lotto(6, 49).length === 6)
  }

  test("list of negative numbers should throw exception") {
    assertThrows[IllegalArgumentException] {
      lotto(6, -49)
    }
  }

}
