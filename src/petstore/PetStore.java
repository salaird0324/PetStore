/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petstore;

import pettypes.Cat;
import pettypes.Dog;
import static petstore.Gender.*;

/**
 *
 * @author Spencer Laird
 */
public class PetStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pet pet = new Pet();
        
        pet.setName("Maggie");
//        pet.age = 3;
        pet.setGender(FEMALE);
//        pet.type = "dog";
        
        System.out.println("name = " + pet.getName());
        
        Pet pet2 = new Pet("Cat", "kitty", 2, FEMALE);
        System.out.println("Pet2 name = " + pet2.getName());
        
        pet2.setName("Spotty");
        System.out.println("Pet2 name = " + pet2.getName());
        
        Dog dog = new Dog("Fido", 3, MALE);
        
        dog.birthday();
        
        System.out.println("Dog Birthday: " + dog.getAge());
        dog.birthday();
        System.out.println("Dog Birthday: " + dog.getAge());
        dog.birthday();
        System.out.println(dog.getName() + " is " + dog.getAge() + " years old");
             
        Dog dog2 = new Dog("Halo", 5, FEMALE);
        
        System.out.println(dog2.getName() + " is " + dog2.getAge() + " years old");
        
        dog2.birthday();
        
        System.out.println(dog2.getName() + " is " + dog2.getAge() + " years old");
        
        Cat cat = new Cat("Susan", 2, FEMALE);
        
        //implicit cast, legal because all cats are pets.
        //Same as Pet pet3 - new Cat("susan", 2, FEMALE);
        Pet pet3 = cat;
        
        Cat cat2 = (Cat)pet3;
        
        //Pet pet3 = (Pet)cat;  EXPLICIT CAST 
        
        if(cat2 instanceof Cat){
            Cat cat3 = (Cat) pet3;
        }
        
        cat.meow();
        
        System.out.println("break");
        
        cat.meow(3);
        
        Dog dog3 = new Dog("test", 21, FEMALE);
        
        System.out.println("test: " + Dog.test);
        
        Dog.test = "changed";
        Dog dog4 = new Dog("test2", 15, FEMALE);
        
        System.out.println("tes2: " + Dog.test);
        System.out.println("test: " + Dog.test);
        //static variables will change across fields
        
        Dog dog5 = new Dog("Jimmy", 100, MALE);
        
        System.out.println("Dog: " + dog5.getName() + " ID: " + dog5.getId());
        
        System.out.println("Dog number: " + Dog.getNumOfDogs());
        //below is not reccommended because on static fields you should use the class name.
//         System.out.println("Dog number: " + dog5.getNumOfDogs());

        System.out.println("Dog genus: " + Dog.getGenus());
        
        Dog dog6 = new Dog("Maggie", 14, FEMALE);
        
        System.out.println("Id: " + dog6.getId() + " name is: " + dog6.getName() + " which is " + dog6.getAge() + " years old currently" + dog6.getPosition());
        
        dog6.sit();
        System.out.println("Id: " + dog6.getId() + " name is: " + dog6.getName() + " which is " + dog6.getAge() + " years old currently" + dog6.getPosition());
        
        System.out.println("Good dog! Maggie is a good girl!");
        
        dog6.bark(2);
    }
    
}
