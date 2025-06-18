package Method;
import java.util.*;
public class smallest_and_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any three number:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int SandL = smallestlargest(a,b,c);
		System.out.println(SandL);
	}
	
	public static int smallestlargest(int a , int b, int c) {
		
		if(a > b) {
			if(a > c) {
				return a;
			}else {
				return c;
			}
		}else {
			if(b > c) {
				return b;
			}
			else {
				return c;
			}
		}
	}

}
