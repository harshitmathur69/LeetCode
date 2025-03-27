import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            int[] prices = new int[N];
            for (int j = 0; j < N; j++) {
                prices[j] = scanner.nextInt();
            }
            Arrays.sort(prices);
            int min = 0;
            for (int j = 0; j < N; j += (K + 1)) {
                min += prices[j];
            }
            System.out.println(min);
        }
    }
}








