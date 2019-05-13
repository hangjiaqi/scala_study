package demoObject

object ScalaList {
  /*创建List*/
  val list1 = List(1, 2)
  println(list1) // List(1,2)

  /*访问List元素*/
  val value1 = list1(1)
  println(value1) //2
  /*List元素的追加*/
  val list2 = list1 :+ 99
  println(list2) //List(1,2,99)
  val list3 = 100 +: list1
  println(list3) //List(100,1,2)

  /**
    * List的创建与追加，符号“::”，注意观察去掉Nil和不去掉Nil的区别
    */
  val list4 = 1 :: 2 :: 3 :: list1 :: Nil
  println("list 4 =" + list4) //List(1,2,3,List(1,2))

  val list5 = 1 :: 2 :: 3 :: list1
  println("list 5 =" + list5) //List(1,2,3,1,2) 类似java addAll
  def main(args: Array[String]): Unit = {

  }
}
