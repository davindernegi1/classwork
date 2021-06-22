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
        int userInputOfGame=0;   // Variable to set userinput for choosing 1 to 3
        int counterTie=0; // to count the number of tie
        int counterUserWin=0; // to count the number of User win
        int counterComputerWin=0; // to count the number of compter win
        int userInputAgain=1; // or initializing main loop if user want to play again
        int userInputPlayingAgain=0; // to take input from user if want to play again
        
  for(int a=0; a<=userInputAgain; a++){      
 //Storing input given by user with the help of TakingUserInput method.
  int userInputRange= TakingUserInput("Please choose how many round you want to play between 1 to 10 : ");
  // Check if user has input as per defined range        
  
      if (userInputRange>10 || userInputRange<1)
  {
      System.out.println("You have inputed a wrong range which is: " + userInputRange + " should be between 1 to 10");
      break;
  } else // play the game as per given input
  {
      for (int i=1;i<=userInputRange; i++){
      userInputOfGame=TakingUserInput("Let's begin! Select 1 = Rock, 2 = Paper or 3 = Scissors ");
      Random rGen = new Random();
      int computerSelection= rGen.nextInt(2)+1;
      
  // worng input part incase user enter wrong value rather than 1 to 3
          if (userInputOfGame>3 || userInputOfGame<1)
      {
          System.out.println("Wrong selection");
          System.exit(0);
      }
          //Checking computer selection to be fair    
      System.out.println("Cheking Computer selection " + computerSelection);
      
      if (computerSelection == userInputOfGame){
          System.out.println("Wow ! It's tie");
          counterTie=counterTie+1;
      } 
      else           if (computerSelection == 2 && userInputOfGame == 1 || computerSelection == 3 && userInputOfGame == 2 || computerSelection == 1 && userInputOfGame == 3 )
          {
              System.out.println("computer win");
              counterComputerWin=counterComputerWin+1;
          }
          else
          {
              System.out.println("User wins");
              counterUserWin= counterUserWin+1;
          }
                      
          }   
          
          }
    
      //Overall winner of the game
        System.out.println("Number of user Win: "+ counterUserWin);
        System.out.println("Number of Computer Win: "+ counterComputerWin);
        System.out.println("Number of tie: "+ counterTie);
        
        if (counterComputerWin>counterUserWin)
        {
            System.out.println("Overall Game winner is.... Computer");
        }
   if (counterComputerWin<counterUserWin)
        {
            System.out.println("Overall Game winner is.... User");
        }
   if (counterComputerWin==counterUserWin)
        {
            System.out.println("Overall game was a tie");
        }
   
   //user inputs to play again or not
 userInputPlayingAgain = TakingUserInput("Well Played ! Do you want to play again. Enter 0 for No and 1 for Yes ?");
 if (userInputPlayingAgain==0)
 {
     System.out.println("“Thanks for playing!”");
     break;
 }
 if (userInputPlayingAgain==1)
 {
     System.out.println("Perfect, Let's play again");
     userInputAgain=userInputAgain+1;
     
 }
 if (userInputPlayingAgain>2 || userInputPlayingAgain<0)
 {
     System.out.println("Wrong input, See you again");
 break;
 }
 
        }
   
    
    }
          
      // method created to take input from user.
       
    public static int TakingUserInput (String userPreference)
    {
       Scanner userInput = new Scanner(System.in); // Decalaration and initializion of the scanner method to take user input
        System.out.println(userPreference);
      int userInputString= Integer.parseInt(userInput.nextLine());
    return userInputString;
    }
}