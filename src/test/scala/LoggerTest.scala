import org.scalatest.flatspec.AnyFlatSpec

class LoggerTest extends AnyFlatSpec {


  "Argument" should "be valid if" in{
    val result =new Logger()
    assert("[INFO]: Test to see If Only Message is Passed" == result.log("Test to see If Only Message is Passed"))
  }

  "Argument" should "be invalid" in{
    val result =new Logger()
    assert("[Test to see If values mismatch]: INFO" == result.log("INFO", "Test to see If values mismatch"))
  }

}
