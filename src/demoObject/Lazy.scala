package demoObject

/**
  * 当val被声明为lazy时，他的初始化将被推迟，
  * 直到我们首次对此取值，适用于初始化开销较大的场景。
  * 1) lazy示例：通过lazy关键字的使用与否，来观察执行过程
  * 通过debug 调试在第一步的时候msg 中的_value
  */
object Lazy {
  def init(): String = {
    println("init方法执行")
    "嘿嘿嘿,我来了~"
  }

  def main(args: Array[String]): Unit = {
    lazy val msg = init()
    var message=msg //debug到这里只执行了"嘿嘿嘿,我来了",并没有执行到println("init方法执行")
    println("lazy方法没有执行")
    println(msg)
  }
}
