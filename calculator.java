package bridgelabz;

import java.util.*;

// Write a program to create a basic calculator for addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float num1 = sc.nextInt();
		float num2 = sc.nextInt();
		
		float add = num1 + num2;
		float sub = num1 - num2;
		float mul = num1 * num2;
		
		String div;
		if(num2 == 0) {
			div = "undefined";
		}
		else {
			float division = num1 / num2;
			div = String.valueOf(division);
		}
		
		System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "+ num1 +" and "+ num2 +" is "+ add +" , " + sub +" , " + mul+" , "+ div +" . " );

	}

}
