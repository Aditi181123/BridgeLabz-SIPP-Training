package Stream_API;

import java.util.*;

public class UniqueWords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            words.add(sc.nextLine());
        }
        sc.close();

        long count = words.stream().distinct().count();
        System.out.println(count);
    }
}