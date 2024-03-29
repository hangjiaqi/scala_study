package demoObject

/**
  * 捕获了异常: java.lang.Exception: 0作为了除数
  */
object ExceptionSyllabus {

  def divider(x: Int, y: Int): Float = {
    if (y == 0) throw new Exception("0作为了除数")
    else x / y
  }

  def main(args: Array[String]): Unit = {
    try {
      println(divider(10, 0))
    } catch {
      case ex: Exception => println("捕获了异常: " + ex)
    } finally {}
  }
}
