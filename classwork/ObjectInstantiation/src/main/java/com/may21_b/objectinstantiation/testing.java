/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.may21_b.objectinstantiation;

/**
 *
 * @author davinder
 */
public class testing {
    public static void main(String[] args) {
        int count =19;
        changeMyValue(count);
        //int a= changeMyValue(count);
       //count =  a;
       System.out.println("The count is " + count);
       
       Person myPerson = new Person();
       myPerson.setAge(24);
       myPerson.setName("Joe");
        System.out.println("Age = " + myPerson.getAge());
        System.out.println("Name = " + myPerson.getName());
        
        changeMyName(myPerson);
        System.out.println("Age = " + myPerson.getAge());
        System.out.println("Name = " + myPerson.getName());
        
    }
    
    public static void changeMyValue(int value)
    {
        value=21;
        //return value;
    }
    public static void changeMyName(Person anything)
    {
    anything.setName("Steve");
    
    }
    
}
