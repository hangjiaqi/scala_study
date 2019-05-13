package demoObject

object ScalaSetDemo {
  /*不可变set*/
  val set = Set(1, 2, 3)
  println(set)

  /*可变set集合*/
  val mutableSet = scala.collection.mutable.Set(1, 2, 3)
  println(mutableSet)

  /*可变集合的元素添加*/
  mutableSet.add(4)
  mutableSet += 6
  //注意该方法返回一个新的Set集合,而非再原有的基础上进行添加
  println(mutableSet.+(5)) //Set(1, 5, 2, 6, 3, 4)
  println(mutableSet) //Set(1, 2, 6, 3, 4)

  /*可变集合的元素删除*/
  mutableSet -= 6
  mutableSet.remove(2)
  println(mutableSet) //Set(1, 3, 4)

  def main(args: Array[String]): Unit = {
    for (x <- mutableSet) {
      println(x)
    }
    mutableSet.foreach(println)
  }

  /**
    * 1	def +(elem: A): Set[A]	为集合添加新元素，并创建一个新的集合，除非元素已存在
    * 2	def -(elem: A): Set[A]	移除集合中的元素，并创建一个新的集合
    * 3	def contains(elem: A): Boolean	如果元素在集合中存在，返回 true，否则返回 false。
    * 4	def &(that: Set[A]): Set[A]	返回两个集合的交集
    * 5	def &~(that: Set[A]): Set[A]	返回两个集合的差集
    * 6	def ++(elems: A): Set[A]	合并两个集合
    * 7	def drop(n: Int): Set[A]]	返回丢弃前n个元素新集合
    * 8	def dropRight(n: Int): Set[A]	返回丢弃最后n个元素新集合
    * 9	def dropWhile(p: (A) => Boolean): Set[A]	从左向右丢弃元素，直到条件p不成立
    * 10	def max: A	查找最大元素
    * 11	def min: A	查找最小元素
    * 12	def take(n: Int): Set[A]	返回前 n 个元素
    */
}
