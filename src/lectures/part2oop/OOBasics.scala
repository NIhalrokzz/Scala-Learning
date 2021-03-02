package lectures.part2oop

object OOBasics extends App {
  val person = new Person("Nihal",24)
  println(person.age)
  println(person.x)
  println(person.greet("Niket"))
}

// constructor
class Person(name: String, val age: Int) {
  //body
  val x = 3 // this is a field

  println(1 + 3)

  //method
  def greet(name: String): Unit = println(s"hii, ${this.name}")

  // overloading
  def greet(): Unit = println(s"Hii, ${name}")
}

// class parameters are not FIELDS, to make it class fields add val or var in it