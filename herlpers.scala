package helpers

// Implementing helper functions
def factorial(n: Int): Int =
  if n <= 1 then 1
  else n * factorial(n - 1)

// Testing the helper functions utilizing the "uTest" framework
import utest._

private object CalculatorTest extends TestSuite:
   val tests = Tests:
    test("factorial"):
      val f = factorial(6);  
      f ==> 720

