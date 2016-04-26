package codility.equlibrium

object Solution {
  def solution(A: Array[Int]): Int = {
    val longs = A.scanLeft(0L)(_ + _).tail

    def equilibrium(index: Int) = leftSum(index) == rightSum(index)

    def leftSum(index: Int) = if (index == 0) 0 else longs(index - 1)

    def rightSum(index: Int) = longs.last - longs(index)

    (0 until A.length) find (equilibrium(_)) getOrElse (-1)
  }
}
