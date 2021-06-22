/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicprogramingassement;

/**
 *
 * @author davinder
 * Created on 2021-06-21
 * playing a game of Rock,Paper, Scissors
 */
import java.util.Random; // java utility to use Random and Scanner methods
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        int MINIMUM =1; // constatnt integer value for assigning minimum range
        int MAXIMUM =10; // constatnt integer value for assigning maximum range
        int userInputOfGame=0;   //
 //Storing input given by user with the help of TakingUserInput method.
  int userInputRange= TakingUserInput("Please choose how many round you want to play between 1 to 10 : ");
  // Check if user has input as per defined range        
  if (userInputRange>10 || userInputRange<1)
  {
      System.out.println("You have inputed a wrong range which is: " + userInputRange);
      
  } else // play the game as per given input
  {
      for (int i=1;i<=userInputRange; i++){
      userInputOfGame=TakingUserInput("Let's begin! Select 1 = Rock, 2 = Paper or 3 = Scissors ");
      Random rGen = new Random();
      int computerSelection= rGen.nextInt(2)+1;
          System.out.println("Cheking Computer selection" + computerSelection);
      if (userInputOfGame>3 || userInputOfGame<1)
      {
          System.out.println("Wrong selection");
          break;
      }
      else if (computerSelection == userInputOfGame){
          System.out.println("Wow ! It's tie");
      } 
      else           if (computerSelection == 2 && userInputOfGame == 1 || computerSelection == 3 && userInputOfGame == 2 || computerSelection == 1 && userInputOfGame == 3 )
          {
              System.out.println("computer win");
          }
          else
          {
              System.out.println("User wins");
          }
                      
          }   
          
          }
    
      System.out.println(userInputOfGame);
    
    }
          
      
      
    
          
       
    public static int TakingUserInput (String userPreference)
    {
       Scanner userInput = new Scanner(System.in); // Decalaration and initializion of the scanner method to take user input
        System.out.println(userPreference);
      int userInputString= Integer.parseInt(userInput.nextLine());
    return userInputString;
    }
}