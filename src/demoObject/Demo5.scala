package demoObject

object Demo5 {
  def main(args: Array[String]): Unit = {
    var a = 60;           /* 60 = 0011 1100 */
    var b = 13;           /* 13 = 0000 1101 */
    var c = 0;

    c = a & b;            /* 12 = 0000 1100 */
    println("a & b = " + c ); //12

    c = a | b;            /* 61 = 0011 1101 */
    println("a | b = " + c ); //61

    c = a ^ b;            /* 49 = 0011 0001 */
    println("a ^ b = " + c ); //49

    c = ~a;               /* -61 = 1100 0011 */
    println("~a = " + c );  //-64

    c = a << 2;           /* 240 = 1111 0000 */
    println("a << 2 = " + c );  //240

    c = a >> 2;           /* 215 = 1111 */
    println("a >> 2  = " + c ); //15

    c = a >>> 2;          /* 215 = 0000 1111 */
    println("a >>> 2 = " + c ); //15


  }
}
