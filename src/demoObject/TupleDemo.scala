package demoObject

/**
  * 元组
  * 可以理解为一个容器，可以存放各种相同或不同类型的数据
  */
object TupleDemo {
  val tuple1 = (1, 2, 3, "heiheihei")
  println(tuple1)

  val value = tuple1._4
  println(value)

  def main(args: Array[String]): Unit = {
    /**
      * 元祖的遍历
      */
    for (elem <- tuple1.productIterator) {
      print(elem)
    }

    /**
      * 方式2
      */
    tuple1.productIterator.foreach(i =>println(i))
    tuple1.productIterator.foreach(print)
  }
}
