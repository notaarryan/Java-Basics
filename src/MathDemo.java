//this file is about the math class in java.lang package
//it is a utility class
//all methods in this class are static so there is no use to create its reference

import java.lang.Math;

public class MathDemo {
    public static void main(String[] args) {
        //this method generates a random value in the range [0.0,1.0)
        //it returns a double
        double random1 = Math.random();
        System.out.println(random1);

        //to generate a random number in other ranges
        //this generates an integer from 1 to 100
        int random2 = (int) (Math.random()*100)+1;
        System.out.println(random2);

        //rounding
        //1.Math.round(double a/float a) -> returns a rounded off int if float is passed
        //                                  returns a rounded off long if double is passed

        int round1 = Math.round(1.0f);
        System.out.println(round1);

        long round2 = Math.round(2.0);
        System.out.println(round2);

        //2.Math.ceil(double a) -> returns a double rounded of to a higher or equal to value

        double ceil1 = Math.ceil(24.01);
        System.out.println(ceil1);

        double ceil2 = Math.ceil(24.0);
        System.out.println(ceil2);

        //3.Math.floor(double a) -> returns a double rounded of to a lower or equal to value

        double floor1 = Math.floor(24.39);
        System.out.println(floor1);

        double floor2 = Math.floor(23.0);
        System.out.println(floor2);
    }
}
