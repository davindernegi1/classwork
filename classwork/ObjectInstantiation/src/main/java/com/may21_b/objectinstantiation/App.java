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
public class App {
    public static void main(String[] args) {
        
        Adder myAdder = new Adder();
        int sum = myAdder.add(4,6);
        System.out.println("The Sum is " + sum);
    }
}
