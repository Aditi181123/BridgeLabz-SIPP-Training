package Control_flow;

import java.util.*;

public class factbyfor {

	 public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n= sc.nextInt();
			
			if(n<0) System.out.println("not possible");
			else {
				long factorial = 1;

		        for (int i = 1; i <= n; i++) {
		            factorial *= i;
		        }
		        System.out.println(factorial);
			}
			sc.close();

	 }
}
