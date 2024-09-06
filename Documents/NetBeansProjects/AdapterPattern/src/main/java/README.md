1. 
Adapter pattern : one of the 23 design patterns  in the "Gang of Four" (GoF) book titled
 "Design Patterns: Elements of Reusable Object-Oriented Software" 
by Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides.


Adapter pattern : a structural design pattern ,that allows incompatible interfaces or classes to work together,
 making it possible for a class to interact with another class that it otherwise ,
could not due to differences in their interfaces.
: acts as a translator  

Key Concepts
Target: the interface or class that your application expects to work with.
Adaptee: the existing class that you want to adapt to the Target interface.
Adapter: the class that implements the Target interface and translates requests from the Target to the Adaptee, 
making them compatible.

Example to Illustrate the Concept
Imagine you have a smartphone with a standard USB port, and you want to connect it to an old printer that only has a parallel port. The interfaces (ports) are incompatible, but you can use an adapter (a USB-to-parallel adapter) to make them work together.

In terms of software:(from the pov of Printer)

Target: The USB port (interface your application expects).
Adaptee: The parallel port (existing interface that you need to work with).
Adapter: The USB-to-parallel adapter (the code that makes the USB and parallel port compatible).


Example code : 
You need a way to make a Bird (which cannot squeak) behave like a ToyDuck (which can squeak).

Absolutely, let's break it down further with the same analogy:

### Simple Explanation

1. **Imagine Two Things**:
   - **Bird**: Think of a real bird that chirps.
   - **ToyDuck**: Think of a toy duck that squeaks.

2. **The Problem**:
   - You have a toy duck slot (like a place where only toy ducks are accepted), but you want to use your real bird instead.

3. **What You Need**:
   - You need a way to make your real bird fit into this toy duck slot. The toy duck slot expects a squeak sound, but the bird chirps.

4. **How the Adapter Helps**:
   - **`BirdAdapter`**: This is like a clever translator or converter. When you tell it to squeak (like asking the toy duck to make a sound), it doesn’t just make a squeak. Instead, it makes the real bird chirp, so the bird's chirp fits the slot where a squeak is expected.

### Putting It All Together

- **BirdAdapter**: Think of it as a special device that allows you to use the chirping bird in place of the squeaking toy duck. It makes sure that when the system asks for a squeak, it gets a chirp from the bird.

So, with the **adapter**, you can use the bird where a toy duck is required without changing anything about the bird or the toy duck slot.

Assumptions
Existing Interfaces and Classes:

Bird Interface:
This interface represents birds and has methods like fly() and makeSound().
Assumption: Birds can fly and make sounds, which is typical for bird behavior.
ToyDuck Interface:
This interface represents toy ducks and has a method squeak().
Assumption: Toy ducks make a squeaking sound, which is typical for toy ducks.
Objective:

You want to use a Bird object (which implements the Bird interface) where a ToyDuck object (which implements the ToyDuck interface) is expected.
Assumption: Your system or application is designed to work with ToyDuck objects and you need to integrate Bird objects into this system without changing the existing code that works with ToyDuck.
Interface Incompatibility:

Assumption: The Bird and ToyDuck interfaces have different methods and cannot be used interchangeably without modification.
Bird has fly() and makeSound().
ToyDuck has squeak().
Adapter Pattern Solution:

Assumption: You need a way to make a Bird (which cannot squeak) behave like a ToyDuck (which can squeak).
The Adapter pattern helps here by creating a BirdAdapter class that implements the ToyDuck interface and translates calls to the Bird interface methods.