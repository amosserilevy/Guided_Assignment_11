/*
 * This class get 3 lengths that represent a triangle sides.
 * The lengths will be calculated to determine the triangle type.
 */

 import java.util.Scanner;

 public class Triangle
 {
     public static void main(String[] arg) 
     {
         Scanner scan=new Scanner(System.in);
         
         System.out.println("Welcome To the triangle type calculator.");
         
         // Getting data from user.
         System.out.println("Type the first side length");
         int x = scan.nextInt();
         System.out.println("Type the second side length");
         int y = scan.nextInt();
         System.out.println("Type the third side length");
         int z = scan.nextInt();
         
         if ( x+y <= z || y+z <= x || z+x <= y) // Checking for a valid triangle parameters.
         {
             System.out.println("The numbers: " + x + ", " + y + " and " + z + " cannot represent a triangle");
         }
         else // Checking for the Type of the triangle.
         {
             if (x==y && y==z) // Checking for an equilateral triangle.
             {
                 System.out.println("The numbers: " + x + ", " + y + " and " + z + " represent an equilateral triangle");
             }
             else if ( x==y && y!=z || y==z && z!=x || z==x && x!=y ) // Checking for an isosceles triangle.
             {
                 System.out.println("The numbers: " + x + ", " + y + " and " + z + " represent an isosceles triangle");
             }
             else if ( x*x + y*y == z*z || y*y + z*z == x*x || z*z + x*x == y*y ) // Checking for a right-angle triangle.
             {
                 System.out.println("The numbers: " + x + ", " + y + " and " + z + " represent a right-angle triangle");
             }
             else // The remaining triangle option is a common triangle.
             {
             System.out.println("The numbers: " + x + ", " + y + " and " + z + " represent a common triangle");
             }
         } // end of if else statements
     } // end of method main
 } // end of class Triangle
