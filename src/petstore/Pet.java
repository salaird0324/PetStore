/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petstore;

/**
 *
 * @author Spencer Laird
 */
public class Pet {
    
    public String type; 
    public String name; 
    public int age;
    public Gender gender;
    
    
    public Pet(){
        age = 0;
        
    }
    public Pet(String type, String name){
        this();
        this.type = type;
        this.name = name;
    }
    
    public Pet(String type, String name, int age, Gender gender){
        this(type, name);
       
        this.age = age;
        this.gender = gender;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }
    
    public void birthday(){
        age++;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setGender(Gender gender){
        this.gender = gender;
    }
    
    public Gender getGender(){
        return this.gender;
    }
}
