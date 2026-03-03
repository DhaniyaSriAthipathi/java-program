import java.util.Scanner;

public class Theatre1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int revenue=sc.nextInt();
        int snack=sc.nextInt();
        int maintenanceCost=sc.nextInt();
        int electricity=sc.nextInt();
        int profit=revenue+snack-maintenanceCost-electricity;
        System.out.println(profit);
    }
}
