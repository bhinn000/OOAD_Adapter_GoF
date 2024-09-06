/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooad;

public class Sparrow implements Bird{
    @Override
    public void fly(){
        System.out.println("Bird can fly");
    }
    
    @Override
    public void makeSound() {
        System.out.println("Chirp Chirp");
    }
}
