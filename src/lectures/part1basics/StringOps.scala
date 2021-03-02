package lectures.part1basics

object StringOps extends App {
  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))

  println(str.substring(7,11))

  println(str.split(" ").toList)

  println(str.startsWith("Hello"))

  println(str.replace(" ","-"))

  println(str.toLowerCase())

  println(str.length)

  val aNumberString = "45"
  val aNumber = aNumberString.toInt

  println('a' +: aNumberString :+ 'z')
  // +: prepending :+ Appending

  println(str.reverse)
  println(str.take(2))

  //Scala specific String Interpolators

  // S- interpolators
  val name = "David"
  val age = 23
  val greeting = s"Hello ${name} , age is ${age}"

  println(greeting)

  // F-interpolators
  val speed = 1.2f
  val myth = f"$name cam eat $speed%2.2f"
  println(myth)

  // raw-interpolator
  println(raw"This is a \n new line")
  val escaped = "This is a \n new line"

  println(raw"$escaped")
}
