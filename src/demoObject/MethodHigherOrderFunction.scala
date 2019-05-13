package demoObject

object MethodHigherOrderFunction {


  def main(args: Array[String]): Unit = {

    /**
      * f : Int => String
      * Int类型的入参,返回值String 类型的
      * 1.将apply看做是一个方法
      * (b是int 类型, f 是int 类型的入参返回一个String 类型的方法,v是一个int类型的入参,返回的是一个int类型的值)
      * 2.testapply[String]是泛型 其也可以变成任意的字母,至于为什么,还需进一步了解
      * 3.f(v(b)) 是关键
      * 其意思就是 apply(layout(sumNumber(b)))
      * layout 入参是Int 返回值是String
      */
    println(apply(100, layout, sumNumber))
    println(layout(100));
    println(apply(100, testapply, sumNumber))
    println(apply(100, layout, sumNumber))
  }

  def apply(b: Int, f: Int => String, v: Int => Int) = f(v(b))

  def sumNumber(s: Int) = s + 2;

  def testapply[String](str: String) = "测试一下行不行" + str;

  def layout[String](x: String) = "[" + x.toString() + "]"

}
