/**
 * 
 */
package Assignment_4;																						 // Package Declared
/**
 * The Dog class will have all the features of the animal class. But cat class can have it's own features
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com> 
 */
public class Dog extends Animal {																			  // Class Dog Declared which will inherit the properties of Animal class
	 public Dog() {																							  // Non-Argument Method created
        System.out.println("I am a general dog"+															  // This will print the argument in the next line
                           "\nNon-Argument Method Called\n");}
     public Dog(String breed) {																				  // Single Argument Method created
        System.out.println("I am a dog of this kind: " + breed+""+"\nSingle Argument Method Called\n"+		  // This will print the argument in the next line
        				   "In above two Case Dog() Method overloading take place. "
        				   + "Firstly with Non- Argument Method then with Single Argument Method.\n");}
    @Override
    public void eat() {																						  // eat() method overriding take place
        System.out.println("Dog eats default food"+															  // This will print the argument in the next line
        				   "\neat() Method is originally created in Animal class. "
        				   + "Now, eat() Method is overriding in Dog Class which extends Animal Class\n");}
    public void eat(String food) {																			  // Overloading the overriding Method
        System.out.println("Dog eats this food: " + food+""+												  // This will print the argument in the next line
        					"\nNow, I have Overloading the overriding Method" );}
}																											  // Dog class Closed
