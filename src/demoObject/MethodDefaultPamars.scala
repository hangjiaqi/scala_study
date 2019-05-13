package demoObject

/**
  * 函数示例4：带有默认值参数的函数，调用该函数时，
  * 可以只给无默认值的参数传递值，也可以都传递，新值会覆盖默认值；
  * 传递参数时如果不按照定义顺序，则可以通过参数名来指定
  */
object MethodDefaultPamars {
  def main(args: Array[String]): Unit = {
    println("Returned Value :" + addInt());
  }

  def addInt(a: Int = 5, b: Int = 7): Int = {
    var sum: Int = 0;
    sum = a + b;
    return sum
  }
}
