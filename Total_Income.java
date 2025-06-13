package bridgelabz;

import java.util.*;

public class Total_Income {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        double salary = scanner.nextDouble();

        double bonus = scanner.nextDouble();

        double totalIncome = salary + bonus;

        System.out.printf("The salary is INR %.2f and the bonus is INR %.2f. Hence Total Income is INR %.2f", salary, bonus, totalIncome);

        scanner.close();
    }
}