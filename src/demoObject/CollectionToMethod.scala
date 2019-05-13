package demoObject

object CollectionToMethod {

  /*map：将集合中的每一个元素映射到某一个函数*/
  val names = List("Alice", "Bob", "Nick")
  println(names.map(_.toUpperCase))

  /* flatmap：flat即压扁，压平，扁平化，效果就是将集合中的每个元素的子元素映射到某个函数并返回新的集合*/
  println(names.flatMap(_.toUpperCase()))

  //折叠，化简：将二元函数引用于集合中的函数
  val list = List(4, 4, 4, 4, 4)
  val i1 = list.reduceLeft(_ - _) // -12 //从左找到中间的数,往后叠减
  val i2 = list.reduceRight(_ - _)//从左找到中间的数
  //叠加,传入1,1+2+3+4+5+1
  val i4 = list.fold(1)((sum, y) => sum + y)
  println(i1)
  println(i2)
  println(i4)

  def main(args: Array[String]): Unit = {

  }
}
