package demoObject

/**
  * 集合遍历
  */
object ForToListDemo {
  def main(args: Array[String]): Unit = {
    var a = 0;
    val numList = List(1, 2, 3, 4, 5, 6, 7);

    //for loop execution with a collection

    for (a <- numList) {
      println("Value of a: " + a);
    }
  }
}
