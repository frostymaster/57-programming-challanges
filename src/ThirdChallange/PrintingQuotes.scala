package ThirdChallange

/**
  * Created by Игорь on 07.06.2016.
  */
object PrintingQuotes {

  def main(args: Array[String]) : Unit = {
    print("What is the quote?  ")
    val quote = scala.io.StdIn.readLine()
    print("Who said that?  ")
    val whoSaid = scala.io.StdIn.readLine()
    print(whoSaid + " says, \"" + quote + "\"")
  }

}
