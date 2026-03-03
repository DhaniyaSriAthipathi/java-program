import java.util.Scanner;
public class Fuel1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int distance=sc.nextInt();
        int mileage=sc.nextInt();
        int price=sc.nextInt();
        int tollCharge=sc.nextInt();
        int needed=distance/mileage;
        int cost=needed*price;
        int tripCost=cost+tollCharge;
        System.out.println(tripCost);


    }
}
