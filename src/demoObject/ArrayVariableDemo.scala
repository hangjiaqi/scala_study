package demoObject

import scala.collection.mutable.ArrayBuffer

/**
  * 变长数组
  */
object ArrayVariableDemo {
  val arr2 = ArrayBuffer[Int]()
  //追加值
  arr2.append(7)

  //重新赋值
  arr2(0) = 71

  val arr3 = ArrayBuffer[Int]()


  def main(args: Array[String]): Unit = {
    println(arr2.size)
    println(arr2)

    arr3.toArray//转为定长数组
    arr3.toBuffer//转为变长数组
  }
}
