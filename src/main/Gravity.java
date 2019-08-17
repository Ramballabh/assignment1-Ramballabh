/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

 import java.util.Scanner;
// uncomment the above line to use input in your program.

public class Gravity {
	// TODO 1: Create the main method
	public static void main(String[] args) {
		/* TODO 2:
		 *   a. Declare all your necessary variables inside main method.
		 *   b. Declare a constant for 'gravity', assume the value to be 9.8
		 *   c. Calculate the result and print it to the screen.
		 * */
		double time;
		double g=9.8;
		double speed;
		double distance;
		Scanner sc=new Scanner(System.in);
		time =sc.nextDouble();
		speed=g*time;
		distance=g*time*time*0.5;
		System.out.println("The speed of the object at "+time+" secands after its release is "+speed+" and the distance the object has travelled in the "+time+" secands after the release is "+distance);



	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
