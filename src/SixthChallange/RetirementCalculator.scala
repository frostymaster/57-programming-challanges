package SixthChallange

import java.util.Calendar

/**
  * Created by Игорь on 09.06.2016.
  */
object RetirementCalculator {

  def main(args: Array[String]) : Unit = {
    print("What's your current age?  ")
    val age = scala.io.StdIn.readLine()

    print("At what age would you like to retire?  ")
    val retire = scala.io.StdIn.readLine()

    val ageInt = age.toInt
    val retireInt = retire.toInt

    val yeaar = Calendar.getInstance().get(Calendar.YEAR)

    println("You have " + (retireInt - ageInt) + " years until retirement")
    print("It's " + yeaar + ", so you can retire in " + (yeaar + (retireInt - ageInt) ))
  }

}
