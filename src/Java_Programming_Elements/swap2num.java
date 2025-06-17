package Java_Programming_Elements;

import java.util.*;

public class swap2num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int firstElement = sc.nextInt();
		int secondElement = sc.nextInt();
		int a = firstElement;
		firstElement = secondElement;
		a = secondElement;
		System.out.println("firstElement: "+firstElement+"secondElement"+secondElement);


		sc.close();
	}

}
