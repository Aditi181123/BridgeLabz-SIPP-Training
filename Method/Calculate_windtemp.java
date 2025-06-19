package Method;
import java.util.*;
public class Calculate_windtemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature and wind speed :");
		
		double temp = sc.nextDouble();
		double windspeed = sc.nextDouble();
		
		double windchill = calculateWindChill(temp, windspeed);
		System.out.println(windchill);
		sc.close();
		
	}
	public static double calculateWindChill(double temp, double windspeed) {
		double a = Math.pow(windspeed, 0.16);
		double c = 0.4275 * temp - 35.75;
		double b = 35.74 + 0.6215 * temp + c * a;
		return b;
	}

}
