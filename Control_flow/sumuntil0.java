package Control_flow;

import java.util.*;

public class sumuntil0 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double input;

        System.out.print("Enter a number (0 to stop): ");
        input = scanner.nextDouble();

        while (input != 0.0) {
            total += input;
            System.out.print("Enter a number (0 to stop): ");
            input = scanner.nextDouble();
        }

        System.out.println("Total sum is: " + total);
        scanner.close();
	}
}
