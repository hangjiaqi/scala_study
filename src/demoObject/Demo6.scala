package demoObject

object Demo6 {
  def main(args: Array[String]): Unit = {
    var a = 10;
    var b = 20;
    var c = 0;

    c = a + b;
    println("c = a + b  = " + c );  //30

    c += a ;
    println("c += a  = " + c );//40

    c -= a ;
    println("c -= a = " + c );//30

    c *= a ;
    println("c *= a = " + c );//300

    a = 10;
    c = 15;
    c /= a ;
    println("c /= a  = " + c ); //1

    a = 10;
    c = 15;
    c %= a ;
    println("c %= a  = " + c );//5

    c <<= 2 ;
    println("c <<= 2  = " + c );//20

    c >>= 2 ;
    println("c >>= 2  = " + c );//5

    c >>= 2 ;
    println("c >>= 2  = " + c );//1

    c &= a ;
    println("c &= a  = " + c );//0

    c ^= a ;
    println("c ^= a  = " + c );//10

    c |= a ;
    println("c |= a  = " + c );//10


}
}
