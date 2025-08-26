package Stream_API;

import java.util.*;

public class SortDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i=0; i<n; i++) {
            numbers.add(sc.nextInt());
        }
        sc.close();

        numbers.stream()
               .sorted(Comparator.reverseOrder())
               .forEach(num -> System.out.print(num + " "));
    }
}