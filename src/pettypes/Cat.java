/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pettypes;

import petstore.Gender;
import petstore.Pet;

/**
 *
 * @author Spencer Laird
 */
public class Cat extends Pet {
    
    public Cat(String name, int age, Gender gender){
        super("Cat", name, age, gender);
    }
    
    public void meow(int num){
        for(int i =0; i<num;i++){
            System.out.println("Meow.");
        }
    }
    
    public void meow(){
        meow(1);
    }
    public String meow(String noise){
        return noise;
    }
    
    @Override
    public int getAge(){
        return age * 7;
    }
}
