/*
@author: Christian Davis
@date: 2/10/2025
@purpose: The Dog Class for JAVA
*/

package labs.example.physics;

public class Main {
    
    public static void main(String[] args) {
        Physics physics = new Physics();

        physics.getDistance(0, 0);
        physics.getVelocity(0, 0);
        physics.getMomentum(0, 0);
        physics.getForce(0, 0);
        physics.getWork(0, 0);
        physics.getKineticEnergy(0, 0);
        physics.getPotentialEnergy(0, 0, 0);

        System.out.println("The distance is " + physics.getDistance(0, 0) + " miles!");
        System.out.println("The velocity is " + physics.getVelocity(0, 0) + " mph!");
        System.out.println("The momentum is " + physics.getMomentum(0, 0) + " kg m/s!");
        System.out.println("The force is " + physics.getForce(0, 0) + " kg m/s^2!");
        System.out.println("The work is " + physics.getWork(0, 0) + " Joules!");
        System.out.println("The Kinetic Energy is " + physics.getKineticEnergy(0, 0) + " NM!");
        System.out.println("The Potential Energy is " + physics.getPotentialEnergy(0, 0, 0) + " NM!");
    }
}
