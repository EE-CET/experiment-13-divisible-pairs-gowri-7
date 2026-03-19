
import java.util.Scanner;

public class DivisiblePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] freq = new int[k];
        long count = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int rem = num % k;
            int need = (k - rem) % k;

            count += freq[need];
            freq[rem]++;
        }

        System.out.println(count);
    }
}
