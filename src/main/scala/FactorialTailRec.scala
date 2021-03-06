import scala.annotation.tailrec

class FactorialTailRec {

  def factorial(num: Int): Int = {

    @tailrec
    def factHelper(num: Int, acc: Int): Int = {
      if (num <= 1) acc
      else factHelper(num - 1, acc * num)

    }
    factHelper(num, 1)
  }
}
