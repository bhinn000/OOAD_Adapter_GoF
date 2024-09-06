
package com.mycompany.ooad;

public class AdapterPatternDemoBird {
    public static void main(String[] args) {
        // Create instances of Sparrow and PlasticToyDuck
        Bird sparrow = new Sparrow(); // Bird is an interface implemented by Sparrow
        ToyDuck toyDuck = new PlasticToyDuck(); // PlasticToyDuck implements ToyDuck

        // Create an adapter for the Bird
        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        // Test the Sparrow
        System.out.println("Sparrow...");
        sparrow.fly(); // Outputs: Bird can fly
        sparrow.makeSound(); // Outputs: Chirp Chirp

        // Test the PlasticToyDuck
        System.out.println("PlasticToyDuck...");
        toyDuck.squeak(); // Outputs: Squeak

        // Test the BirdAdapter
        System.out.println("BirdAdapter...");
        birdAdapter.squeak(); // Outputs: Chirp Chirp (bird's sound)
    }
}
