package demoObject

object ForOrYieLdDemo {
  def main(args: Array[String]): Unit = {
    var a = 0;
    val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    //FOR loop execution with a yieId
    var retVal = for {a <- numList if a != 3; if a < 8} yield a;
    println(retVal);
    //Now print returned values using another loop;

    for (a <- retVal) {
      println("Value of a :" + a);
    }
  }
}
