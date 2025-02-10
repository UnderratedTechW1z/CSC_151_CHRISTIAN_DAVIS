/*
@author: Christian Davis
@date: 2/10/2025
@purpose: My Main JAVA Program that uses the Mammal.Java file
*/
package labs.example.mammals;

public class Main {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog();

        dog.setName("Dog");
        dog.getMammalDetails();
        dog.eat();
        dog.sit();
        dog.bark();
    }
}
