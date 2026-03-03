import java.util.Scanner;

public class Hotel1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int roomBooked=sc.nextInt();
        int priceRoom=sc.nextInt();
        int service=sc.nextInt();
        int commission=sc.nextInt();
        int revenue=(roomBooked*priceRoom)+service-commission;
        System.out.println(revenue);
    }
}
