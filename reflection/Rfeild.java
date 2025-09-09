package reflection;

import java.lang.reflect.Field;
class Person {
    private String name = "John Doe";

}
public class Rfeild {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Class<?> cls = person.getClass();
        
        Field field = cls.getDeclaredField("name");
        field.setAccessible(true); 
        System.out.println("Old Value: " + field.get(person));
        
        field.set(person, "Alice");
        
        System.out.println("New Value: " + field.get(person));
    }
}
