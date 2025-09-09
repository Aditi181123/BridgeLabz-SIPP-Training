package reflection;
import java.lang.reflect.*;

class Employee{
	private String name;
	private int age;
}
public class Learn1 {
	public static void main(String[] args) throws ClassNotFoundException{
		// method 1
		Class<?> cls1 = Employee.class;
		// method 2
		Employee emp = new Employee();
	    Class<?> cls2 = emp.getClass();
	    // method 3
	    // Class<?> cls3 = Class.forName("Employee");

		System.out.println("Class Name : " + cls2.getName());
	}
	

}
