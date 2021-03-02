package Excerices

object Exercise1 extends App {

  // 1. difference b/w "hello world" vs println("hello world")
  /* "hello World" = type String
  println("hello World") = type unit
  * */
  val someValue = {
    2 < 3
  }

  println(someValue)

  val someOtherValue = {
    if(someValue) 234 else 456
    42
  }

  println(someOtherValue)
}
