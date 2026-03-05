import java.util.Scanner;

public class Conditional4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.nextLine();
        String loyalty=sc.nextLine();
        int  cartvalue=sc.nextInt();
        sc.nextLine();
        String product=sc.nextLine();
        String membership=sc.nextLine();
        int tier=0;
        int add=0;
        if(loyalty.equals("Bronze"))
        {
            tier=5;
        }
        else if(loyalty.equals("Silver"))
           { tier=8;}
        else if(loyalty.equals("Gold"))
            {tier=12;}
        else if(loyalty.equals("Platinum"))
            {tier=15;}
        if(cartvalue>=500 && cartvalue<=999)
        {
            add+=3;
        }
        else if(cartvalue>=1000 && cartvalue<=1999)
        {
            add+=5;
        }
        else if(cartvalue>=2000)
            add+=7;
        if(product.equals("Electronics") && membership.equals("Prime"))
            add+=5;
        else if(product.equals("Fashion"))
            add+=3;
        else if(product.equals("Books") && membership.equals("Prime"))
            add+=5;
        else if(product.equals("Groceries") && cartvalue>300)
            add+=2;
        int total=tier+add;
        int finalvalue=cartvalue*(1-total/100);
        int saving=cartvalue-finalvalue;
        System.out.println("Loyalty tier : "+loyalty);
        System.out.println("Cart value : "+cartvalue);
        System.out.println("Product category : "+product);
        System.out.println("Membership : "+membership);
        System.out.println("Base discount : "+tier);
        System.out.println("Additional discount : "+add);
        System.out.println("Total discount : "+total);
        System.out.println("Final price : "+finalvalue);
        System.out.println("Saving : "+saving);


        
        


    }
}
