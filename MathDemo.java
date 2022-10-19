//import static java.lang.Math.*;

public class MathDemo{
    public static void main(String[] args){
        
        double x1 = 17.2;
        double y1 = -8.5;
        double x2 = 5.6;
        double y2 = -2;
        int z = 7;
        
        //absolute value
        System.out.println(Math.abs(y1));
        //System.out.println(abs(y2)); only use if import is used
        
        //square root something
        
        double squareRoot = Math.sqrt(z);
        System.out.println(squareRoot); //integer arguement works
        
        //use exponents
        
        double powerExample = Math.pow(7,5);
        System.out.println("7 to the 5th power is: " + (int) powerExample);
        
        //find the sin, cos, and tan of an angle
        int angle = 60;
        double angleInRad = Math.toRadians(angle);
        System.out.println("The cos of 60 degrees is " + Math.cos(angleInRad));
        System.out.println("The true value is 0.5");
        
        //convert to radians by multipling by pi/180
        final double PI = Math.PI;
        double angleInRad2 = angle*(PI/180);
        System.out.println("The cos of 60 degrees is " + Math.cos(angleInRad2));
        System.out.println("The true value is 0.5");
        
        //area of a circle
        
        double radius = 4.0;
        //make area variable
        double radiusSquared = radius*radius;
        double Area = radiusSquared*PI;
        //print
        System.out.println(Area);
        
        
    }
}