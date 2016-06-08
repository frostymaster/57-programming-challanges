package FirstChallange

/**
  * Created by Игорь on 07.06.2016.
  */
object HelloScalaWithoutVariables {
  def main(args: Array[String]) : Unit = {
    print("What's your name? ")
    print("Your name is a  " + scala.io.StdIn.readLine())
  }
}
