package demoObject


object ScalaMap {
  //构造不可变映射
  val map1 = Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> 30)
  println(map1)

  //构造可变映射
  val map2 = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> 30)
  println(map2)

  //空的映射
  val map3 = new scala.collection.mutable.HashMap[String, Int]
  println(map3)
  //对偶元组
  val map4 = Map(("Alice", 10), ("Bob", 20), ("Kotin0", 30))
  println(map4)

  def main(args: Array[String]): Unit = {
    /*取值*/
    val value1 = map1("Alice") //建议使用get方法得到map中的元素
    val value2 = map1.get("Alice")
    println(value1)
    println(value2)
    map2("Alice") = 100
    println("修改后的Alice:" + map2)
    map2 += ("HangJiaQi" -> 23, "duyong" -> 50)
    println("新增HangJiaQi:" + map2)
    map2 -= ("HangJiaQi", "duyong")
    var str = map2.getOrElse("HangJiaQi", "已经被删除了")
    println(str)
    println("删除HangJiaQi:" + map2)
    for ((k, v) <- map1) println("key :" + k + ",value :" + v)
    for (v <- map1) print(v + "\t")

  }
}
