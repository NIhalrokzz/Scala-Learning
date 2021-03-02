package Excerices

object Excercise2 extends App {
  def greeting(name: String, age: Int): Unit = {
    println(s"Hii, my name is $name and I am $age years old")
  }

  println(greeting("Nihal",24))

  def factorial(num: Int): Int = {
    if(num == 0) 1
    else num*factorial(num-1)
  }

  println(factorial(5))

  def fibonacci(num: Int): Int = {
    if(num == 0) 1
    else if (num == 1) 1
    else fibonacci(num-1) + fibonacci(num-2)
  }

  println(fibonacci(5))

  def aPrime(n: Int):Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if(t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(n/2)
  }

  println(aPrime(15))

}

