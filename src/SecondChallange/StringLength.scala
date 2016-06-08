package SecondChallange

/**
  * Created by Игорь on 07.06.2016.
  */
object StringLength {

  def main(args: Array[String]) : Unit = {
    var isNotEmpty = false
    while(isNotEmpty == false) {
      print("What is the input string?  ")
      val inputString = scala.io.StdIn.readLine()
      if(inputString.length > 0) {
        print(inputString + " has " + inputString.length.toString + " characters")
        isNotEmpty = true
      } else {
        println("String is empty. Re-enter")
      }
    }
  }

}
