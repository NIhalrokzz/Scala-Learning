package lectures.part1basics

object expressions extends App {
  val x:Int = 5
  println(x)

  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3 //IF Expression

  var aVariable: Int = 3
  var i = 0
  while(i < 10){
    println(i)
    i += 1
  }

  // Never use while again

  // Everything in Scala is a expression

  val aWierdValue = (aVariable = 3) // Unit === void
  println(aWierdValue)

  //side effects: println(), while, reassignment

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if(x > 2) "Hello" else "Bye"
  }
}
