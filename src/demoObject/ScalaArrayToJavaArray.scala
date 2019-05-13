package demoObject

import java.util

import scala.collection.mutable.ArrayBuffer


object ScalaArrayToJavaArray {

  val arr4 = ArrayBuffer("1", "2", "3")

  //Scala to Java
  import scala.collection.JavaConversions.bufferAsJavaList
  val javaArr = new ProcessBuilder(arr4)
  println(javaArr.command())


  //Java to Scala
  import scala.collection.JavaConversions.`deprecated asScalaBuffer`
  import scala.collection.mutable.Buffer
  val buffer :Buffer[String] =javaArr.command()
  println(buffer)
  def main(args: Array[String]): Unit = {
    println(javaArr.command());
    println(buffer)
    for (x <- buffer) {
      println(x)
    }
  }
}
