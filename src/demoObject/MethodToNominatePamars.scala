package demoObject

object MethodToNominatePamars {
  def main(args: Array[String]): Unit = {
    printInt(b = 5, a = 7);

    printStrings("hang","jia","qi");
  }

  def printInt(a: Int, b: Int) = {
    println("Value of a : " + a)
    println("Value of b : " + b)
  }

  def printStrings(args: String*): Unit = {
    var i: Int = 0;

    for (arg <- args) {
      println("Arg value[" + i + "] = " + arg)
      i = i + 1;
    }

  }
}
