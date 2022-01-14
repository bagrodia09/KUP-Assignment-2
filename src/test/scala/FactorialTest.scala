import org.scalatest.flatspec.AnyFlatSpec

class FactorialTest extends AnyFlatSpec {

  val FactorialObj= new Factorial

  "Factorial" should "return 1 if user input is 0" in{
    val result: Int= FactorialObj.fact(0)
    assert(result==1)
  }
  "Factorial" should "return 1 if user input is 1" in{
    val result: Int=FactorialObj.fact(1)
    assert(result==1)
  }
  "Factorial" should "return 1 if the user input is negative number" in{
    val result : Int= FactorialObj.fact(-1)
    assert(result==1)
  }
}
