import java.util.Scanner;

public class Apartment1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int collection=sc.nextInt();
        int parking=sc.nextInt();
        int hall=sc.nextInt();
        int security=sc.nextInt();
        int electricity=sc.nextInt();
        int cleaning=sc.nextInt();
        int balance=collection+parking+hall-security-electricity-cleaning;
        System.out.println(balance);
    }
}
