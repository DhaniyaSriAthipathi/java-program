import java.util.Scanner;

public class Conditional18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double packagee =sc.nextDouble();
        sc.nextLine();
        String destination=sc.nextLine();
        String shipping=sc.nextLine();
        String packagesize=sc.nextLine();
        double shippingrate=0;
        double zone=0;
        double size=0;
        double surcharge=1;
        if(shipping.equals("Economy"))
        {
            shippingrate=5;
        }
        else if(shipping.equals("Standard"))
        {
            shippingrate=10;
        }
        else if(shipping.equals("Express"))
        {
            shippingrate=25;
        }
        else if(shipping.equals("Overnight"))
        {
            shippingrate=50;
        }
        if(destination.equals("Local"))
        {
            zone=1.0;
        }
        else if(destination.equals("Regional"))
        {
            zone=1.2;
        }
        else if(destination.equals("National"))
        {
            zone=1.5;
        }
        else if(destination.equals("International"))
        {
            zone=3.0;
        }
        if(packagesize.equals("Small"))
        {
            size=0;
        }
        else if(packagesize.equals("Medium"))
        {
            size=5;
        }
        else if(packagesize.equals("Large"))
        {
            size=15;
        }
        else if(packagesize.equals("Oversized"))
        {
            size=30;
        }
        double basecost=(shippingrate+surcharge)*zone;
        double totalcost=basecost+size;
        System.out.println("Package weight : "+packagee);
        System.out.println("Destination zone : "+destination);
        System.out.println("Shipping speed : "+shipping);
        System.out.println("Package size : "+packagesize);
        System.out.println("Base shipping rate : "+shippingrate);
        System.out.println("Weight surcharge : "+surcharge);
        System.out.println("Zone multipier : "+zone);
        System.out.println("Size surchagre : "+size);
        System.out.println("Total shipping cost : "+basecost);
        System.out.println("EsTIMATED  : "+totalcost);
    }
}
