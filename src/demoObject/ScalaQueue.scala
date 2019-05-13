package demoObject

import scala.collection.mutable

object ScalaQueue {
  //队列的创建
  val q1 = new mutable.Queue[Int]()
  println(q1)

  //队列元素的追加
  q1 += 1;
  println(q1)

  //向队列中追加List
  q1 ++= List(2, 3, 4)
  println(q1)

  //按照进入队列的顺序删除元素
  q1.dequeue()
  println(q1)

  //塞入数据
  q1.enqueue(9, 8, 7)
  println(q1)

  //返回队列的第一个元素
  println(q1.head)

  //返回队列的最后一个元素
  println(q1.last)

  //返回除了第一个以外的元素
  println(q1.tail)

  def main(args: Array[String]): Unit = {

  }
}
