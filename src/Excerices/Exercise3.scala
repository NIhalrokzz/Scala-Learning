package Excerices

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Exercise3 extends App {

  def concatntimes(a: String, n: Int): String = {
    @tailrec
    def concathelper(x : Int, accumulator: String): String = {
      if(x <= 0) accumulator
      else concathelper(x-1, accumulator + a)
    }
    concathelper(n,"")
  }

  println(concatntimes("hii", 3))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeHelper(x: Int, accumulator: Boolean): Boolean = {
      if(!accumulator) false
      else if(x <= 1) true
      else isPrimeHelper(x-1, n%x != 0 && accumulator)
    }
    isPrimeHelper(n/2,true)
  }

  println(isPrime(15))

  def factorial(n: Int):Int = {
    @tailrec
    def factorialHelper(x:Int, accumulator: Int): Int = {
      if(x <= 1) accumulator
      else factorialHelper(x-1, accumulator*x)
    }

    factorialHelper(n, 1)
  }

  println(factorial(5))
}
