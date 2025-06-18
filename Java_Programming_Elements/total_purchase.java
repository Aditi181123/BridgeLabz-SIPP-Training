package Java_Programming_Elements;

import java.util.Scanner;

public class total_purchase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Unit Priced and Quantity brought: ");
		float price = sc.nextInt();
		float quantity = sc.nextInt();
		
		float purchase = price * quantity;
		
		System.out.println("The total purchase price is INR "+ purchase+" if the quantity "+ quantity+ " unit and unit price is INR "+price);

		sc.close();
	}

}
