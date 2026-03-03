import java.util.Scanner;

public class Car1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rental=sc.nextInt();
        int rentPer=sc.nextInt();
        int late=sc.nextInt();
        int fuel=sc.nextInt();
        int maintenance=sc.nextInt();
        int profit=(rental*rentPer)+late-fuel-maintenance;
        System.out.println(profit);
    }
}
