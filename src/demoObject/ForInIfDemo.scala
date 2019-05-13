package demoObject

import scala.util.control.Breaks._

/**
  * 内含break continue;
  */
object ForInIfDemo {


  def main(args: Array[String]): Unit = {
    var a = 0;
    val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    //for loop execution with multiple filters

    /**
      * for (int i = 0; i < numbers.length; i++) {
      * if (i == 2) {
      * continue;
      * }
      * if (i == 7) {
      * break;
      * }
      *  System.out.println("Values of a :" +numbers[i]);
      * }
      */
    /**
      * 模仿java 代码 编辑 break 和continue
      * import scala.util.control.Breaks._
      */
    breakable({
      for (a <- numList) {
        breakable({
          if (a == 3) break else println(a)
        })
        if (a == 7) break
      }
    })
    for (a <- numList if a != 3; if a < 8) {
      println("Value of a :" + a);
    }
  }
}
