import java.util.Scanner;

public class Conditional6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String booking=sc.nextLine();
        int days=sc.nextInt();
        double seat=sc.nextDouble();
        sc.nextLine();
        String route=sc.nextLine();
        int amt=0;
        double demamd=0;
        String price="Low ";
        if(booking.equals("Economy"))
        {
            if(route.equals("Domestic"))
            {
                amt=200;
            }
            else if(route.equals("Int-Short"))
            {
                amt=500;
            }
            else if(route.equals("Int-Long"))
            {
                amt=800;
            }
        }
        else if(booking.equals("Business"))
        {
            if(route.equals("Domestic"))
                amt=600;
            else if(route.equals("Int-Short"))
                amt=1500;
            else if(route.equals("Int-Long"))
                amt =2500;
        }
        else if(booking.equals("First"))
        {
            if(route.equals("Domestic"))
                amt=1000;
            else if(route.equals("Int-Short"))
                amt=3000;
            else if(route.equals("Int-Long"))
                amt=5000;
        }
        if(seat<30 && days<14)
        {
            demamd=1.8;
            price="high demand";
        }
        else if(seat<50 && days<30)
        {
            demamd=1.5;
            price="high demand";
        }
        else if(seat<60 || (days>=30 && days<=60))
        {
            demamd=1.0;
            price="Moderate";
        }
        else if(seat>=60 && days>60)
        {
            demamd=0.8;
            price="Low demand";
        }
        double finalprice=(amt * demamd);
        System.out.println("Booking class : "+booking);
        System.out.println("Days until Departure : "+days);
        System.out.println("Seat availability : "+seat);
        System.out.println("Route Tpye : "+route);
        System.out.println("Base price : "+amt);
        System.out.println("Demand mulitpier : "+demamd+"x");
        System.out.println("Final Ticket price : "+finalprice);
        System.out.println("Price category : "+price);

    }
}
