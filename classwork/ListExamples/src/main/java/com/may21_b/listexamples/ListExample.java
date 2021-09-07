/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.may21_b.listexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author davinder
 */
public class ListExample {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        System.out.println("List Size : " + listString.size());
        
        listString.add("First String");
        listString.add("Second String");
        listString.add("third String");
        listString.add("fourth String");
        System.out.println("List Size : " + listString.size());
        
        for (String davinder : listString)
        {
            System.out.println(davinder);
        }
        
        Iterator<String> iterator = listString.iterator();
        
        while (iterator.hasNext())
        {
        
        String currentString = iterator.next();
            System.out.println(currentString);
        }
        
        
       /* listString.remove(1);
        System.out.println("List Size : " + listString.size());
        listString.remove(0);
        System.out.println("List Size : " + listString.size());
        //listString.remove(0);
        System.out.println("List Size : " + listString.size());*/
    }
    
}
