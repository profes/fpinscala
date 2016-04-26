package codility.test04

import org.scalatest._

class MissingIntegerSpec extends FlatSpec with Matchers {

  "Foo" should "blah" in {
    MissingInteger.solution(Array(1, 3, 6, 4, 1, 2)) should be (5)
  }

}
