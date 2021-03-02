package lectures.part1basics

import scala.annotation.tailrec

object recursion extends App {

  def factorial(n: Int): Int = {
    if(n <= 1) 1
    else {
      //println(s"Computing factorial of ${n} - I first need factorial of ${n-1}")
      val  result = n * factorial(n-1)
      //println(s"Computed factorial of ${n}")

      result
    }
  }
  println(factorial(5))

  //Optimal factorial

  def anotherFactorial(n: Int): Int = {
    @tailrec //this will tell the compiler that recursion is tail recursive, if it's not tail recursive.
    // Then it will throw a erro
    def factHelper(x: Int, accum: Int): Int = {
      if(x <= 1) accum
      else factHelper(x-1,accum * x)
    }

    factHelper(5,1)
  }

  println(anotherFactorial(5))

  // When loop is needed use tail recursion
}
