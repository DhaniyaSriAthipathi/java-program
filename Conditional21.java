import java.util.Scanner;

public class Conditional21 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String locationzone=sc.nextLine();
        double parkinghours=sc.nextDouble();
        sc.nextLine();
        String vehicletype=sc.nextLine();
        String membership=sc.nextLine();
        double allzone=5.00;
        double premium=0;
        double surchagre=0;
        double discount=0;
        double cap=0;
        if(locationzone.equals("Downtown"))
        {
            premium=50;
        }
        else if(locationzone.equals("Business-district"))
        {
            premium=30;
        }
        else if(locationzone.equals("Residential"))
        {
            premium=0;
        }
        else if(locationzone.equals("Airport"))
        {
            premium=100;
        }
        if(vehicletype.equals("Motorcycle"))
        {
            surchagre=-2;
        }
        else if(vehicletype.equals("Compact"))
        {
            surchagre=0;
        }
        else if(vehicletype.equals("Sedan"))
        {
            surchagre=0;
        }
        else if(vehicletype.equals("SUV"))
        {
            surchagre=3;
        }
        else if(vehicletype.equals("Oversized"))
        {
            surchagre=5;
        }
        double rawfee=(allzone*(1+premium/100)+surchagre)*parkinghours;
        if(membership.equals("None"))
        {
            discount=0;
        }
        else if(membership.equals("Monthly"))
        {
            discount=20;
        }
        else if(membership.equals("Annual"))
        {
            discount=25;
        }
        else if(membership.equals("VIP"))
        {
            discount=30;
        }
        if(parkinghours>=24)
        {
            if(locationzone.equals("Downtown"))
            {
                cap=150;
            }
            else if(locationzone.equals("Business-district "))
            {
                cap=120;
            }
            else if(locationzone.equals("Residentail"))
            {
                cap=60;
            }
            else if(locationzone.equals("Airport"))
            {
                cap=180;
            }
            System.out.println("Location zone : "+locationzone);
            System.err.println("Parking duration : "+parkinghours);
            System.out.println("Vehicle type : "+vehicletype);
            System.out.println("Membership status : "+membership);
            System.out.println("Base hourly rate : "+allzone);
            System.out.println("Zone premium : "+premium);
            System.out.println("Vehicle size surcharge : "+surchagre);
            System.out.println("Membership discount : "+discount);
            System.out.println("Total parking fee : "+rawfee);
            System.out.println("Daily cap applied : "+cap);
           
        }

    }
}
