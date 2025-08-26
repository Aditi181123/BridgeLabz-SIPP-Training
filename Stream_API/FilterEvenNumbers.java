package Stream_API;

import java.util.*;


public class FilterEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            numbers.add(sc.nextInt());
        }

        sc.close();
        numbers.stream()
               .filter(num -> num % 2 == 0)
               .forEach(num -> System.out.print(num + " "));
    }
}