package demoObject

/**
  * def 函数名(参数名1: 参数类型1, 参数名2: 参数类型2) : 返回类型 = {函数体}
  * 返回Unit类型的函数 等价于void
  *
  */
object MethodDemo {
  def printMe(): Unit = {
    println("Hello,VoidMethod")
  }
  //返回Unit类型的函数，但是没有显式指定返回类型。（当然也可以返回非Unit类型的值）
  /*def printMe() {
    println("Hello,VoidMethod")
  }*/


  def addInt(a: Int, b: Int): Int = {
    var sum: Int = 0;
    sum = a + b;
    return sum;
  }

  def main(args: Array[String]): Unit = {
    this.printMe();
    println("sum = " + this.addInt(10, 20)); //sum = 30

  }
}
