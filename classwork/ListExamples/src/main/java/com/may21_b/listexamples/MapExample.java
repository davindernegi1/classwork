/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.may21_b.listexamples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author davinder
 */
public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> population= new HashMap();
        
        population.put("USA", 31300000);
        population.put("CANADA", 3400000);
        population.put("UK", 6300000);
        population.put("JAPAN", 12700000);
        
        System.out.println("Size of map: " + population.size());
        int a = population.get("USA");
        System.out.println(a);
        
        Set<String> keys = population.keySet();
               
        for (String k : keys)
        {
            int currentPopulation = population.get(k);
            
            System.out.println("Population of "+ k + " is "+currentPopulation);
        }
        
        Collection<Integer> currentValues = population.values();
        for (int k : currentValues)
        {
            System.out.println(k);   
        }
        
        
    }
}
