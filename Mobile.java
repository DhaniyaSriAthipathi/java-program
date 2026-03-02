
import java.util.Scanner;
public class Mobile {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double cost=sc.nextDouble();
        double gb=sc.nextDouble();
        double rate=sc.nextDouble();
        double tax=sc.nextDouble();
        double extra=gb*rate;
        double total=cost+gb;
        double finalBill=total+(total*tax/100);
        System.err.println(finalBill);


    }
    
}
