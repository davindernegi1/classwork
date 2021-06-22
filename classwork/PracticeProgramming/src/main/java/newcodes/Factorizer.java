/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newcodes;

/**
 *
 * @author davinder
 */
import java.util.Scanner;
public class Factorizer {
    public static void main(String[] args) {
        int [] factor = new int [1000];
        Scanner sc = new Scanner(System.in);
        System.out.println("What number would you like to factor? ");
        int userInput = Integer.parseInt(sc.nextLine());
        int j= 0;
        int count = 0;
        int sum = 0;
        int isPrime= 0;
        
        
        for (int i=1; i<=userInput; i++){
            int modulus = userInput%i;
             int division = i/userInput;
        
            if (modulus == 0)
            {
                // System.out.println(i);
                
                    if (factor[j] == 0)
                    {
                    factor[j]= i;
                    j= j+1;
                    }
            }
            if (division == 1) 
            {
               isPrime = i; 
            }
           } 
        
        System.out.println("You have entered "+ userInput); 
        System.out.println("The factors of "+ userInput+" are:");
        for (int i=0; i<factor.length; i++){
        
            if (factor[i] == 0)
            {
                count = i;
            for(int k=0; k<=i-2; k++){
            
                sum = sum + factor [k]; 
            }
            break;
            }
           
            System.out.print(factor[i]+ " ");    
            //System.out.println("let check sum of all factors : " + sum);
        }
        System.out.println();
        
        System.out.println(userInput+" has "+ count +" factors:");
        
        if (sum == userInput)
        {
        
            System.out.println(userInput+" is a perfect number");
        }else
        {
            System.out.println(userInput+" is not a perfect number");
        }
        
      if (isPrime == userInput)
      {
              System.out.println(userInput+" is not a prime number");            
      }else
      {
          System.out.println(userInput+" is  a prime number");
      }
    
        //System.out.println("testing" + isPrime);
    
    }
}
