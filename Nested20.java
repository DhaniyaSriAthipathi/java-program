import java.util.Scanner;
public class Nested20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.nextLine();
        String[] lines = new String[rows];
        for (int i = 0; i < rows; i++) {
            lines[i] = sc.nextLine();
        }
        System.out.println("Original Matrix (" + rows + " x " + cols + "):");
        for (String line : lines) {
            System.out.println(line);
        }
        System.out.println("\nTransposed Matrix (" + cols + " x " + rows + "):");
        for (int c = 0; c < cols; c++) {
            for (int r = 0; r < rows; r++) {
                String[] nums = lines[r].split(" ");
                System.out.print(nums[c] + " ");
            }
            System.out.println();
        }
    }
}