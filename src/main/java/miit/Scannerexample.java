package miit;

import java.util.Scanner;

public class Scannerexample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); //s is the object name
		System.out.println("enter your name:");
		String name=s.nextLine(); // get input from user
		System.out.println("Enter your age:");
		int age=s.nextInt();
		System.out.println("Hello " +name+ " you are "  +age);
		
	}

}
