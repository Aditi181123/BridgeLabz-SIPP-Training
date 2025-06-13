package bridgelabz;
import java.util.*;
public class C2F {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("temp. in celcius");
		int a =	sc.nextInt();
		int b = (a * 9/2)+32;
		System.out.println("temp. in fehrenheit:" + b);
	}
}
