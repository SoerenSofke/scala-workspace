// Testing the functions utilizing the "uTest" framework
package helpers

// Implementing functions
def factorial(n: Int): Int =
  if n <= 1 then 1
  else n * factorial(n - 1)

//> using dep "com.lihaoyi::utest:0.8.5"
import utest._        

private val helperTests = Tests:
  test("factorial"):
    val f = factorial(6)
    assert(f == 721)

// Running test suite
@main
private def main(): Unit =
  val results = TestRunner.runAndPrint(helperTests, "helpers")

