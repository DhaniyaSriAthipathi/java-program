import java.util.*;
public class Array10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0], max = arr[0], count = 0;
        int sum = 0;
        for (int val : arr) {
            if (val < min) min = val;
            if (val > max) max = val;
            if (val > 200) count++;
            sum += val;
        }
        double avg = (double) sum / n;
        double performance = ((double)(n - count) / n) * 100;
        System.out.println("Total Servers: " + n);
        System.out.println("Fastest Response: " + min + "ms");
        System.out.println("Slowest Response: " + max + "ms");
        System.out.printf("Average Response: %.2fms\n", avg);
        System.out.println("Slow Servers (>200ms): " + count);
        System.out.printf("Performance Score: %.2f%%\n", performance);
    }
}