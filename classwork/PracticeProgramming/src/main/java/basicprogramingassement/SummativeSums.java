/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicprogramingassement;

/**
 *@author davinder
 * Created on 2021-06-22
 * Summative sums excercise
 */
public class SummativeSums {
    
    public static void main(String[] args) {
        
        int [] firstArrray = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int [] secondArrray = { 999, -60, -77, 14, 160, 301 };
        int [] thirdArrray = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
140, 150, 160, 170, 180, 190, 200, -99 };
        int sumOfFirstArray =0;
        int sumOfSecondArray =0;
        int sumOfThirdArray =0;
        
       sumOfFirstArray = SumOfIntegers(firstArrray);
       sumOfSecondArray = SumOfIntegers(secondArrray); 
       sumOfThirdArray = SumOfIntegers(thirdArrray);
       
       
       System.out.println("#1 Array Sum: "+ sumOfFirstArray +" ");
System.out.println("#2 Array Sum: "+ sumOfSecondArray +" ");
System.out.println("#3 Array Sum: "+ sumOfThirdArray +" ");


    }
    
    
    public static int SumOfIntegers( int [] values)
    {
        int sumOfValues=0;
        int lengthOfArray= values.length;
        for (int i=0; i<lengthOfArray; i++)
        {
         sumOfValues= sumOfValues + values[i];
        }
    return sumOfValues;
    }
}
