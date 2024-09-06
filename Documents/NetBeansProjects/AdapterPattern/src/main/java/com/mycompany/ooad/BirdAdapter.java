/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooad;

//The BirdAdapter is designed to adapt the Bird class which perform fly and makeSound
//(which doesn’t directly fit the expected ToyDuck interface) 
//so that it can be used where a ToyDuck is needed.
public class BirdAdapter implements ToyDuck {
    Bird bird; //the object that is going to perform the activities is of class 'Bird'

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.makeSound(); 
    }
}

