import org.scalatest.flatspec.AnyFlatSpec

class FactorialTailRecTest extends AnyFlatSpec {

  val FactTailObj= new FactorialTailRec

  "Factorial " should "be Positive" in{
    val result: Int= FactTailObj.factorial(0)
    assert(result==1)
  }

  "Factorial" should "return 1 if user input 0" in{
    val result: Int= FactTailObj.factorial(0)
    assert(result==1)
  }

  "Factorial" should "return 1 if the user input is negative" in{
    val result: Int=FactTailObj.factorial(-1)
    assert(result==1)
  }
}
