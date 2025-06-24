package Built_In_Function;

import java.time.*;
import java.util.*;

public class Date_Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter date in yyyy-mm-dd format : ");
		String str = sc.next();
		
		LocalDate date = LocalDate.parse(str);
		
		LocalDate add = date.plusDays(7).plusMonths(1).plusYears(2);
		System.out.println(add);   
		
		LocalDate finaldate = add.minusWeeks(3);
		System.out.println(finaldate);
		
		sc.close();

	}

}
