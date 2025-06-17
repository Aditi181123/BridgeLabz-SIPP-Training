package Java_Programming_Elements;
import java.util.*;
public class choco_distribution {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        int numberOfChocolates = scanner.nextInt();

        int numberOfChildren = scanner.nextInt();

        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates is " + remainingChocolates);

        scanner.close();    
    }
}


