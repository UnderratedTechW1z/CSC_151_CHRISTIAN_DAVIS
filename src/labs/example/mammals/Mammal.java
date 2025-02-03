/*
@author: Christian Davis
@date: 2/3/2025
@purpose: My Mammal JAVA Program
*/

package labs.example.mammals;
//Class for methods and properties
public class Mammal {
    
    // Properties of the Mammal Class
    protected String hairColor = ("Black");
    protected String eyeColor = ("Brown");
    protected String bodyTemp = ("Warm");
    protected String fingerLength = ("Long");
    protected String height = ("Tall");
    protected String bodyType = ("Skinny");
    protected String headSize = ("Medium");
    protected String name;

    // Methods of the Mammal Class
    public void mammal(String name) {
        
    }

    public void setName(String name){
        this.name = name;
    }

    public void run(){

    }

    public void eat(){
        System.out.println("The " + this.name + " is eating...");
    }

    public void sleep(){
        System.out.println("The " + this.name + " is sleeping...");
    }

    public void scratch(){
        System.out.println("The " + this.name + " scratched you, ouch...");
    }

    public void sit() throws Exception{
        System.out.println("The " + this.name + " sat down...");
        Thread.sleep(15000);
        System.out.println("The " + this.name + " stood up...");
    }

    public void speak(){
        System.out.println("The " + this.name + " barked!");
    }

    public void climb(){

    }

    public void Throw(){

    }

    public void lick(){

    }

    public void read(){

    }

    public void getMammalDetails(){
        System.out.println("The " + this.name + " has the following properties: ");
        System.out.println(hairColor + " Hair");
        System.out.println(eyeColor + " Colored eyes");
        System.out.println(bodyTemp + " body temperature");
        System.out.println(fingerLength + " fingers");
        System.out.println(height + " height");
        System.out.println(bodyType + " body type");
        System.out.println(headSize + " sized head");
    }
    
}


