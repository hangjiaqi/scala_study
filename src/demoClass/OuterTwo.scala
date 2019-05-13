package demoClass

class OuterTwo {

  class Inner {
    def f() {
      println("f")
    }

    class InnerMost {
      f() //ok
    }

  }

  (new Inner).f() //OK because now f() is public
}
