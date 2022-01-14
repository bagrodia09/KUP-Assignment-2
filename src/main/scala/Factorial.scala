
class Factorial {

  def fact(num: Int): Int =
    if (num <= 1)
      1
    else {
      num * fact(num - 1)
    }

}
