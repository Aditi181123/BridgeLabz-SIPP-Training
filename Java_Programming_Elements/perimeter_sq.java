package Java_Programming_Elements;

import java.util.*;

public class perimeter_sq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("perimeter of sqaure: ");
		Scanner sc = new Scanner(System.in);
		float perimeter = sc.nextInt();
		
		double side = perimeter / 4;
		
		System.out.println("The length of the side is "+ side +" whose perimeter is "+ perimeter);
		sc.close();
	}


}
