/**
 * 
 */
package Assignment_4;													                										 // Package Declared							
/**
 * Write a program to demonstrate the use of method overloading and method overriding.
 * 
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 */
public class Assignment_4_1 {																									  // Class Declared	
public static void main(String[] args) {																						  // Main method Started
	System.out.println("!!!!!!!!!Small But Effective Program to understand Overridding and Overloading of Methods!!!!!!!!!\n" );  // This will print the argumentin the next line
	Animal animal = new Dog();																									  /* we can see that which method to be invoked is decided at runtime, based on the actual object. 
																						 										  * The animal reference variable is of type Animal, but it points to the actual object Dog, 
																						 										  * thus the overriding version of eat() method in the Dog class is invoked
																						 										  */
	Dog bulldog = new Dog("Bulldog");													 										  // new instance created 
	animal.eat();																		 										  // animal variable used to call eat() method	
	bulldog.eat("Bones");																 										  // variable bulldog used to call eat() method with Single argument. 
	}
}
