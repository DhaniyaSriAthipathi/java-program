import java.util.Scanner;

public class Conditional22 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int unitconsumed=sc.nextInt();
        sc.nextLine();
        String coustomertype=sc.nextLine();
        String season=sc.nextLine();
        String paymentmethod=sc.nextLine();
        int adjustment=0;
        int discount=0;
        if(coustomertype.equals("Residential"))
        {
            System.out.println("Tier 1 (0-100 units @ $0.10)");
            System.out.println("Tier 2 (101-300 @ $0.15)");
            System.out.println("Tier 3 (301-500 @ $0.25)");
            System.out.println("Tier 4 (501+ @ $0.30)");
        }
        else if(coustomertype.equals("Commerical"))
        {
            System.out.println(" Tier 1 (0-100 @ $0.12)");
            System.out.println(" Tier 2 (101-300 @ $0.18)");
            System.out.println("Tier 3 (301-500 @ $0.25)");
            System.out.println("Tier 4 (501+ @ $0.25)");
        }
        else if(coustomertype.equals("Industrial"))
        {
            System.out.println("Tier 1 (0-100 @ $0.08)");
            System.out.println("Tier 2 (101-300 @ $0.12)");
            System.out.println("Tier 3 (301-500 @ $0.20)");
            System.out.println("Tier 4 (501+ @ $0.20)");
        }
        if(season.equals("Summer"))
        {
            adjustment=+15;
        }
        else if(season.equals("Winter"))
        {
            adjustment=-10;
        }
        else if(season.equals("Regular"))
        {
            adjustment=0;
        }
        if(paymentmethod.equals("Auto-pay"))
        {
            discount=5;
        }
        else if(paymentmethod.equals("Online"))
        {
            discount=3;
        }
        else if(paymentmethod.equals("Manual"))
        {
            discount=0;
        }
        System.out.println("Unit consumed : "+unitconsumed);
        System.out.println("Costumer type : "+coustomertype);
        System.out.println("Season : "+season);
        System.out.println("payment method "+paymentmethod);
        System.out.println("Seasonal adjustment : "+adjustment);
        System.out.println("Payment discount : "+discount);
        
    }
}
