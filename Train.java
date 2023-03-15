/*
 * This class take speed and time (until stop) parameters for 2 trains.
 * after both of the trains stop,
 * it will calculate the distance between them.
 */

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 4 integers ");
        System.out.println("Please enter the speed of train 1:");
        
        int v1 = scan.nextInt(); // Taking speed input for train 1.
        System.out.println("Please enter the time of train 1:");
        int t1 = scan.nextInt(); // Taking time until stop input for train 1.
        System.out.println("Please enter the speed of train 2:");
        int v2 = scan.nextInt(); // Taking speed input for train 2.
        System.out.println("Please enter the time of train 2:");
        int t2 = scan.nextInt(); // Taking time until stop input for train 1.
        
        float train1Stop = (v1 * t1) / 60f; // Storing the distance that train 1 has done.
        float train2Stop = (v2 * t2) / 60f; // Storing the distance that train 2 has done.
        
        System.out.println("The distance between the trains is " + Math.abs(train1Stop - train2Stop) + " km."); // 
    } // end of method main
} // end of class Train
