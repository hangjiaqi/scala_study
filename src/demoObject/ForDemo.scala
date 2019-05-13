package demoObject

object ForDemo {
  def main(args: Array[String]): Unit = {
    var a = 0;
    //to : 默认步进为1
    var to1 = 1 to 10
    println(to1.toList);
    println("to1 =" + to1);
    //定义一个步进为2的
    var to2 = 0 to 10 by 2;
    println("to2 =" + to2);
    println(to2.toList); //List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val until1 = 1 until 10
    println(until1.toList) //List(1, 2, 3, 4, 5, 6, 7, 8, 9) 与to 区别
    println(until1)
    val until2 = 1 until 10 by 2
    println(until2.toList)
    println(until2)

    //for loop execution with a range

    for (a <- 1 to 10) { //int i = 0;i<a ;i++
      println("to =" + a);
    }

    for (a <- 1 until 10) {
      println("until =" + a);
    }

    var b = 0;

    /**
      * for (int a = 1; a < 4; a++) {
      * for (int b = 1; b < 4; b++) {
      *                 System.out.println("Value of a:" + a);
      *                 System.out.println("Value of b:" + b);
      * }
      * }
      **/
    for (a <- 1 to 3; b <- 1 to 3) {
      println("Value of a:" + a)
      println("Value of b:" + b)
    }

    //使用花括号{}代替小括号()
    /**
      * {}和()对于for表达式来说都可以。for 推导式有一个不成文的约定：
      * 当for 推导式仅包含单一表达式时使用原括号，当其包含多个表达式时使用大括号。
      * 值得注意的是，使用原括号时，早前版本的Scala 要求表达式之间必须使用分号。
      */
    for {i <- 1 to 3
         j = 4 - i}
      println(i * j + "")


    for (a <- 1 to 9; b <- 1 to a) {
      print(a + " * " + b + " = " + a * b + " ")
      if (b == a) println()
    }

    var arr: Array[Int] = Array(1, 2, 3, 4, 5)
    for (i <- arr.indices) {
      println(i)
    }
  }
}
