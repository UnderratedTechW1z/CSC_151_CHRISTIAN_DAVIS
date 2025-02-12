/*
@author: Christian Davis
@date: 2/12/2025
@purpose: The Main Class for my Physics Package
*/

package labs.example.physics;

public class Main {
    
    public static void main(String[] args) {
        Physics physics = new Physics();

        System.out.println("The distance is " + physics.getDistance(2, 2) + " miles!");
        System.out.println("The velocity is " + physics.getVelocity(2, 4) + " mph!");
        System.out.println("The momentum is " + physics.getMomentum(2, 6) + " kg m/s!");
        System.out.println("The force is " + physics.getForce(10, 3) + " kg m/s^2!");
        System.out.println("The work is " + physics.getWork(12, 4) + " Joules!");
        System.out.println("The Kinetic Energy is " + physics.getKineticEnergy(15, 6) + " NM!");
        System.out.println("The Potential Energy is " + physics.getPotentialEnergy(12, 4, 5) + " NM!");
    }
}
