package demoClass

class Outer {

  class Inner {
    private def f() {
      println("f")
    }

    class InnerMost {
      f() //ok
    }

  }
  //(new Inner).f() //Error:f is not accessible
}
