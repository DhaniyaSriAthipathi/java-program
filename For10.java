import java.util.Scanner;

public class For10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        double subtotal=0;
        double total=0;
        double service=0;
        double grand=0;
        for(int i=0;i<n;i++)
        {
            sc.nextLine();
            String itemName=sc.nextLine();
            double pric=sc.nextDouble();
            Double quantity=sc.nextDouble();
            subtotal=pric*quantity;
            System.out.println("Item name : "+itemName);
            System.out.println("Price : "+pric);
            System.out.println("Subtotal : "+subtotal);
        
        System.out.println("Total item  : "+n);
        System.out.println("Subtotal : "+subtotal);
        }
        total=subtotal*0.08;
        service=subtotal*0.10;
        grand=subtotal+total+service;
        System.out.println("Tax : "+total);
        System.out.println("Service charge : "+service);
        System.out.println("Grand total : "+grand);


    
    }

}
