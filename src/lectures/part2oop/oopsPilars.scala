package lectures.part2oop

//Encapsulation

class MyClass(private val name: String,private val age: Int) /*Primary constructor*/{
  // auxiliary constructor
  def this(name: String){
    this(name, 100) //primary constructor
  }

  def test(): Unit ={
    println(s"${name} and age is ${age}")
  }
}

object MyObject {
  def test(): Unit ={
    println("Test Message from singelton object")
  }
}

// Companion object
class MethodsCalled(){
  def test(): Unit = {MethodsCalled.printMsg()}
}

// Classes have full access to the object
object MethodsCalled{
  def printMsg(): Unit = { println("Test Message from companion object") }
}

object oopsPilars {
  def main(args: Array[String]): Unit = {
     val m = new MyClass("Nihal", 24)
    m.test()

    val m1 = new MyClass("Niket")
    m1.test()

    // Objects in scala is like static in java
    // for accessing methods from a class we need to create a instance of it, but for object we can call it directly

    MyObject.test() // Singelton

    // Companion Object
    val method = new MethodsCalled()
    method.test()

  }
}
