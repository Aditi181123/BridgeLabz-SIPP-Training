package bridgelabz;

import java.util.Scanner;

public class SimpInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("rate , time and principal amount : ");
		int r = sc.nextInt();
		int t = sc.nextInt();
		int p = sc.nextInt();
		double interest = p * r* t /100;
		System.out.println(interest);
	}

}
