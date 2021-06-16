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
import  java.util.Random;
public class whileloop {
    public static void main(String[] args) {
        
        Random rGen= new Random();
        
        int randomNumber= rGen.nextInt(10) + 1;
        
        while(randomNumber<9)
        {
            System.out.println(randomNumber);
            randomNumber= rGen.nextInt(10) + 1;
         
        }
            
        Random rng = new Random();

String[] names = new String[] { "Alice", "Bob", "Clarice", "David", "Elizabeth" };
int randomIndex = rng.nextInt( names.length );
String randomName = names[randomIndex];
        System.out.println(randomName);
    
    }
    
}
