package demoObject

/**
  * 方法名调用方式
  */
object MethodToMethodNameDemo {
  def main(args: Array[String]): Unit = {
    delayed(time())
    delayed(1);
  }

  def time() = {
    println("Getting time in nano seconds")
    System.nanoTime()
  }

  def delayed(t: => Long) = {
    println("In delayed method")
    println("Param: " + t)
  }
}
