package demoObject

object RecursiveFunctionDemo {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10)
      println("Factorial of " + i + ": = " + factorial(i))
  }

  def factorial(n: BigInt): BigInt = {
    if (n <= 1) {
      n
    }
    else {
      n * factorial(n - 1)
    }
  }
}
