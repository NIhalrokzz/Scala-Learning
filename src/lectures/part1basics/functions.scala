package lectures.part1basics

object functions extends App {
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("Hello", 3))
  // Function call is also an expression

  def aParameterLessFunction(): Int = 42
  println(aParameterLessFunction())

  def aRepetedFunction(aString: String, n: Int) : String = {
    if( n == 1) aString
    else aString + aRepetedFunction(aString, n-1)
  }

  println(aRepetedFunction("Hello",3))
  // Whenever loops are needed, place recursion

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int):Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

}
