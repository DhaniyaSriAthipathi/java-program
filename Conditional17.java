import java.util.Scanner;

public class Conditional17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String cardtier=sc.nextLine();
        String purchase=sc.nextLine();
        double transaction=sc.nextDouble();
        sc.nextLine();
        String promotional=sc.nextLine();
        double basepoint=1.0;
        double bonus=0;
        double multipier=0;
        double apply=0;
        if(purchase.equals("Groceries"))
        {
            bonus=2.0;
        }
        else if(purchase.equals("Dining"))
        {
            bonus=2.5;
        }
        else if(purchase.equals("Travel"))
        {
            bonus=3.0;
        }
        else if(purchase.equals("Gas"))
        {
            bonus=2.0;
        }
        else if(purchase.equals("Other"))
        {
            bonus=1.0;
        }
        if(cardtier.equals("Basic"))
        {
            multipier=1.0;
        }
        else if(cardtier.equals("Gold"))
        {
            multipier=1.25;
        }
        else if(cardtier.equals("Platinum"))
        {
            multipier=1.5;
        }
        else if(cardtier.equals("Black"))
        {
            multipier=2.0;
        }
        if(promotional.equals("None"))
        {
            apply=1.0;
        }
        else if(promotional.equals("Double-points"))
        {
            apply=2.0;
        }
        else if(promotional.equals("Triple-points"))
        {
            apply=3.0;
        }
        double pointsearnded=transaction*basepoint*bonus*multipier*apply;
        double cashvalue=pointsearnded*0.01;
        System.out.println("Card tier : "+cardtier );
        System.out.println("Purchase category : "+purchase);
        System.out.println("Transaction amount : "+transaction);
        System.out.println("Promotional status : "+promotional);
        System.out.println("Base point rate : "+basepoint);
        System.out.println("Category bonus : "+bonus);
        System.out.println("Tier mulitpier : "+multipier);
        System.out.println("Promotional multiplier : "+apply);
        System.out.println("Point earned : "+pointsearnded);
        System.err.println("Equivalent cash value : "+cashvalue);

    }
}
