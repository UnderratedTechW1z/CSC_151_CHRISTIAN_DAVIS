/*
@author: Christian Davis
@date: 2/20/2025
@purpose: The Main Class for my Physics Package
*/

package labs.example.physics;

public class Main {
    
    public static void main(String[] args) {
        Physics physics = new Physics();
        
        double angleInDegrees = Physics.getTheta(3, 4);
        // Check to see if the angle in degrees in greater than 37 or less than 36.87
        if (angleInDegrees > 37 || angleInDegrees < 36.87){
            // If the argument is true, Create new method called logInvalidAngleInfo()
            Physics.logInvalidAngleInfo(angleInDegrees);
        }
        else{
            // If not, Create new method called logValidAngleInfo()
            Physics.logValidAngleInfo(angleInDegrees);
        }
        
        double distanceCalculated = (physics.getDistance(Physics.getLightSpeedInMPH(), Physics.getTimeFromSunToEarthInHours()));
        double knownDistance = Physics.getKnownDistanceToEarth();

        if (distanceCalculated < knownDistance){
            Physics.logEarthToSunInvalidDistance();
        }
    }
}
