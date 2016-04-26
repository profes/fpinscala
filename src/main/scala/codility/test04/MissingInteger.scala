package codility.test04

/*
Write a function:

object Solution { def solution(A: Array[Int]): Int }

that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer (greater than 0) that does not occur in A.

For example, given:

  A[0] = 1
  A[1] = 3
  A[2] = 6
  A[3] = 4
  A[4] = 1
  A[5] = 2
the function should return 5.

Assume that:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.
 */
object MissingInteger {

  import scala.annotation.tailrec

  def solution(A: Array[Int]): Int = {
    import scala.collection.mutable.BitSet
    val builder = BitSet.newBuilder
    builder.sizeHint(A.length)
    val bits = A.foldLeft(builder.result()) { (acc, i) =>
      if (i > 0 && i <= A.size && !acc.contains(i)) {
        acc + i
      } else acc
    }

    (1 to math.max(bits.size, 1)).foldLeft(math.max(bits.size, 1) + 1) { (acc, i) =>
        bits.contains(i) match {
          case true => acc
          case false => i
        }
    }
  }

  def solution2(A: Array[Int]): Int = {
    import scala.collection.BitSet
    def go(i: Int, b: BitSet): Int = {
      if (i >= A.length) -1
      else {
        ???
      }
    }

    def lowest(b: BitSet): Int = {
      -1
    }

    go(0, BitSet.empty)
  }
}
