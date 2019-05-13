package demoObject

object WhileDemo {
  def main(args: Array[String]): Unit = {
    var a = 1 ;
    var b = true;
    while (b) {
      println("value of a:" + a);
      if (a > 10) {
        b = false;
      }
      a +=a;
      println(a);
    }
  }
}
