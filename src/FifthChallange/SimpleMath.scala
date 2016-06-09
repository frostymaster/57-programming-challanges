package FifthChallange

/**
  * Created by Игорь on 08.06.2016.
  */
object SimpleMath {

  def main(args: Array[String]) : Unit = {
    print("Enter the first number:  ")
    val first = scala.io.StdIn.readLine()

    print("Enter the second number:  ")
    val second = scala.io.StdIn.readLine()

    val firstInt = first.toInt
    val secondInt = second.toInt

    print(first + " + " + second + " = " + (firstInt + secondInt).toString + "\n" +
      first + " - " + second + " = " + (firstInt - secondInt).toString + "\n" +
      first + " * " + second + " = " + (firstInt * secondInt).toString + "\n" +
      first + " / " + second + " = " + (firstInt / secondInt).toString)
  }


}
