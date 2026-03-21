
import java.util.Scanner;
public class Nested15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int products = sc.nextInt();
        double totalRating = 0;
        System.out.println("Star Rating Matrix:");
        System.out.println("Product Rating Stars");
        for (int i = 0; i < products; i++) {
            String name = sc.next();
            double rating = sc.nextDouble();
            System.out.print(name + " " + rating + " ");
            int fullStars = (int) rating;
            for (int j = 1; j <= 5; j++) {
                if (j <= fullStars) {
                    System.out.print("★");
                } else {
                    System.out.print("☆");
                }
            }
            totalRating += rating;
            System.out.println();
        }
        double average = totalRating / products;
        System.out.printf("\nAverage Rating: %.2f\n", +average);
        
    }
}
    

