import java.util.Scanner;

public class Youtube1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int adrev=sc.nextInt();
        int sponsorShip=sc.nextInt();
        int affilate=sc.nextInt();
        int tax=sc.nextInt();
        int product=sc.nextInt();
        int income=adrev+sponsorShip+affilate-tax-product;
        System.out.println(income);
    }
}
