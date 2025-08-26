package Stream_API;

import java.util.*;

public class ConvertToUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> names = new ArrayList<>();
        for (int i=0; i<n; i++) {
            names.add(sc.nextLine());
        }
        sc.close();

        names.stream()
             .map(String::toUpperCase)
             .forEach(name -> System.out.print(name + " "));
    }
}