package lectures.part1basics

object CBNvsCBV extends App {
  def callByValue(x: Long): Unit = {
    println(s"By value ${x}")
  }

  def callByName(x: => Long): Unit = {
    println(s"by value ${x}")
    println(s"by name ${x}")
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())
}
