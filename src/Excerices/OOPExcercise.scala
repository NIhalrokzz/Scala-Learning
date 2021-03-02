package Excerices


object OOPExcercise extends App {
  val author = new Writer("Nihal","Singh", 24)
  val novel = new Novel("Expectation",1990, author)

  print(novel.isWrittenBy(author))

  val count = new Counter()
  count.inc.print
  count.inc.inc.inc.print
  count.inc(10).print
}

class Writer(fname: String, lname: String, val age: Int){
  def fullname: Unit ={
    fname + " "+ lname
  }
}

class Novel(name: String,year: Int, author: Writer){
  def authorAge = year - author.age

  def isWrittenBy(author: Writer) = author == this.author

  def copy(newYear: Int): Novel = new Novel(name, newYear, author)

}

class Counter(val count: Int = 0){
  def inc = {
    println("Incrementing")
    new Counter(count + 1)
  } //immutability
  def dec = {
    println("Decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int):Counter = {
    if(n <= 0) this
    else inc.inc(n-1)
  }

  def dec(n: Int):Counter = {
    if(n <= 0) this
    else dec.dec(n-1)
  }

  def print = println(count)
}
