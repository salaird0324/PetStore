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
public class Dog extends Pet{
    
    public static String test = "test";
    public static int numberOfDogsCreate = 0;
    
    private int id = 0;
    
    private static final String GENUS = "Canis";
    
    private String position = "standing";
    
    public Dog(String name, int age, Gender gender){
        super("Dog", name, age, gender);
        
        id = ++numberOfDogsCreate;
    }
    //cant do this because a constant value cannot be changed 
//    public static int setGenus(){
////        GENUS = "something";
//    }
    public static String getGenus(){
        return GENUS;
    }
    
    public int getId(){
        return id;
    }
    
    public static int getNumOfDogs(){
        return numberOfDogsCreate;
    }
    
    //this is not allowed because satic methods cannot access instance variables.
//    public static int getId2(){
//        return id;
//    }
    
    public void sit(){
        position = "seated";
    }
    
    public void stand()
    {
        position = "standing";
    }    
    
    public String getPosition(){
        return position;
    }
   
    
//    @Override
//    public void birthday(){
//       age += 7; //age= age + 7
//    }
    @Override
    public int getAge(){
        return age * 7;
    }
   
    //the below methods are an example of polymorphism because they use the same
    //name with different parameters 
    public void bark(int num){
        for(int i= 0; i< num; i++){
            System.out.println("bark!");
        }
    }
    
    public void bark(){
       bark(1);
    }
}
