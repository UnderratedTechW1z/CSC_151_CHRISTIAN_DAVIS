/*
@author: Christian Davis
@date: 2/20/2025
@purpose: The Physics Class for my Physics package
*/

package labs.example.physics;
import java.lang.Math;

public class Physics {

    final static double GRAVITY = 9.81;

    public double getDistance(double v, double t){
        double x = v * t;
        return x;
    }

    public double getVelocity(double x, double t){
        double v = x/t;
        return v;
    }

    public double getMomentum(double m, double v){
        double p = m * v;
        return p;
    }

    public double getForce(double m, double a){
        double f = m * a;
        return f;
    }

    public double getWork(double f, double d){
        double w = f * d;
        return w;
    }

    public double getKineticEnergy(double m, double v){
        double ke = 0.5 * m * (v * v);
        return ke;
    }

    public double getPotentialEnergy(double m, double g, double h){
        double pe = m * g * h;
        return pe;
    }

    public static double getTheta(int xVal, int yVal){
        double theta = Math.atan2(xVal, yVal) * 180/3.1415;
        return theta;
    }
    
    // Method for logInvalidAngleInfo()
    public static void logInvalidAngleInfo(double angleInDegrees){
        System.out.println("logging the angle " + angleInDegrees + " degrees. This is not a right angle.");
    }

    // Method for logValidAngleInfo()
    public static void logValidAngleInfo(double angleInDegrees){
        System.out.println("logging the angle " + angleInDegrees + " degrees. This is a valid 3-4-5 triangle.");
    }

    public static int getLightSpeedInMPH(){
        int lightSpeed = 186282 * 3600;
        return lightSpeed;
    }

    public static int lightSpeed(){
        int neutral_lightspeed = 186282;
        return neutral_lightspeed;
    }

    public static double getTimeFromSunToEarthInHours(){
        double sunToEarth = (getKnownDistanceToEarth()/lightSpeed()) / 3600;
        return sunToEarth;
    }

    public static double getKnownDistanceToEarth(){
        double knownDistance = 92947266.72;
        return knownDistance;
    }

    public static void logEarthToSunInvalidDistance(){
        System.out.println("The distance given is invalid...");
    }
}
