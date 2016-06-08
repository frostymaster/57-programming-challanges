package FourthChallange

/**
  * Created by Игорь on 08.06.2016.
  */
object MadLib {

  def main(args: Array[String]) : Unit = {
    print("Enter a noin:  ")
    val noun = scala.io.StdIn.readLine()

    print("Enter a verb:  ")
    val verb = scala.io.StdIn.readLine()

    print("Enter an adjective:  ")
    val adjective = scala.io.StdIn.readLine()

    print("Enter an adverb:  ")
    val adverb = scala.io.StdIn.readLine()

    print("Wow! Look at this " + noun + "! He " + verb + " his leg with a " + adjective + " knife! So " + adverb + "!")
  }

}
