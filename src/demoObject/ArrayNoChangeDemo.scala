package demoObject

/**
  * 定长数组
  */
object ArrayNoChangeDemo {
  val arr1 = new Array[Int](10)
  //赋值
  arr1(1) = 7
  //或者
  val arr2 = Array(1, 2)

  /*二维数组*/
  val arr3 = Array.ofDim[Double](3, 4)

  //赋值
  arr3(1)(1) = 11.11

  def main(args: Array[String]): Unit = {
    for {a <- arr1}
      println(a)
    for {a <- arr2}
      println(a)
    for(a <- arr3 ; b<-a){
      println(a)
      println(b)
    }
  }
}
