package FirstChallange

/**
  * Created by Игорь on 07.06.2016.
  */
object HelloScala {

  def main(args: Array[String]) : Unit = {
    print("What's your name? ")
    val name = scala.io.StdIn.readLine()
    print("Your name is " + name)
  }

}
