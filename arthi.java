package JavaOperators;

import java.util.Scanner;

public class ArithmeticOperators {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int a, b;
		int addition, subtraction, multiplication, division, modulus;
		sc = new Scanner(System.in);
		System.out.println("\n Please Enter two integer Value: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		addition = a + b; 
		subtraction = a - b; 
		multiplication = a * b; 
		division = a / b; 
		modulus = a % b; 
		
		System.out.format("\n Addition of two numbers %d, %d is : %d\n", a, b, addition);
		System.out.format(" Subtraction of two numbers %d, %d is : %d\n", a, b, subtraction);
		System.out.format(" Multiplication of two numbers %d, %d is : %d\n", a, b, multiplication);
		System.out.format(" Division of two numbers %d, %d is : %d\n", a, b, division);
		System.out.format(" Modulus of two numbers %d, %d is : %d\n", a, b, modulus);
	}
}
