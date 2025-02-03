/*
@author: Christian Davis
@date: 2/3/2025
@purpose: My Main JAVA Program that uses the Mammal.Java file
*/
package labs.example.mammals;

public class Main {
    public static void main(String[] args) throws Exception {
        Mammal mammal = new Mammal();

        mammal.setName("Dog");
        mammal.getMammalDetails();
        mammal.eat();
        mammal.sit();
        mammal.speak();
    }
}
