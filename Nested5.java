import java.util.Scanner;
public class Nested5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int daysInMonth = sc.nextInt();
        int startDay = sc.nextInt();
        System.out.println("Calendar Grid:");
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        int date = 1;
        for (int i = 1; i <= 6; i++) {

            // Inner loop for days
            for (int j = 1; j <= 7; j++) {

                if (i == 1 && j < startDay) {
                    // Empty spaces before month starts
                    System.out.print("  ");
                } 
                else if (date <= daysInMonth) {
                    System.out.print(date + " ");
                    date++;
                }
            }
            System.out.println();
            if (date > daysInMonth) {
                break;
            }
        }
    }
} 