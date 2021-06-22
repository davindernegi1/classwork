/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newcodes;

/**
 *
 * @author mamta
 */
public class Arrays {
    public static void main(String[] args) {
        int[] values = {3,7,2,4,7,12};
        int sum =0;
        int min = values[0];
        int max = values[0];
        for (int i=0; i<values.length; i++)
        {
            sum+= values[i];
            System.out.println(i+" Index Value : " + values[i]);
            if(values[i]<min)
                    {
                        min = values[i];
            }
            if (values[i] >max)
            {
            max = values[i];
            }
        }
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Minimum value of array: " + min);
        System.out.println("Maximum value of array: " + max);
    
   // Two dimesnional arrays, defining and initializing
   
   String [][] employee = {
       {"davinder", "good", "Man"},
       {"prince","one"," of"," teammates"},
       {"harpreet"," another"," teammate"}};
     
    
    }
}
