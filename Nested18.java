import java.util.Scanner;
public class Nested18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int periods = sc.nextInt();
        String[] dayNames = {
            "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"
        };
        System.out.println("Class Time Table:");
        System.out.print("Day ");
        for (int i = 1; i <= periods; i++) {
            System.out.print("Period" + i + " ");
        }
        System.out.println();
        for (int i = 0; i < days; i++) {
            System.out.print(dayNames[i] + " ");
            for (int j = 0; j < periods; j++) {
                String subject = sc.next(); 
                System.out.print(subject + " ");
            }
            System.out.println();
        }
    }
}