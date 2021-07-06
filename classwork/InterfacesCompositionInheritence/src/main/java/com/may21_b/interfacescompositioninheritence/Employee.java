/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.may21_b.interfacescompositioninheritence;

/**
 *
 * @author davinder 
 * Created on 2021-jul-06
 * inheritence
 */
public class Employee {
 
    protected String firstName;
    protected String lastName;
    
    public void doWork() {
        // code to do work ...
    }
    
    public void createYearlyObjectives() {
        // code to create yearly objectives...
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }    
}
   