import java.util.Scanner;

public class Conditional19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String movieformat=sc.nextLine();
        String showtime=sc.nextLine();
        String seatcategory =sc.nextLine();
        String coustomer=sc.nextLine();
        double basicprice=12;
        double surcharge=0;
        double upgrade=0;
        double timebased=0;
        double discount=0;
        if(movieformat.equals("2D"))
        {
            surcharge=0;
        }
        else if(movieformat.equals("3D"))
        {
            surcharge=5;
        }
        else if(movieformat.equals("IMAX"))
        {
            surcharge=8;
        }
        else if(movieformat.equals("4DX"))
        {
            surcharge=10;
        }
        if(seatcategory.equals("Standard"))
        {
           upgrade=0; 
        }
        if(seatcategory.equals("Premium"))
        {
            upgrade=4;
        }
        else if(seatcategory.equals("Recliner"))
        {
            upgrade=7;
        }
        if(showtime.equals("Matinee"))
        {
            timebased=-30;
        }
        else if(showtime.equals("Evening"))
        {
            timebased=0;
        }
        else if(showtime.equals("Prime-time"))
        {
            timebased=+20;
        }
        else if(showtime.equals("Late-time"))
        {
            timebased=-20;
        }
        if(coustomer.equals("Adult"))
        {
            discount=0;
        }
        else if(coustomer.equals("Senior"))
        {
            discount=25;
        }
        else if(coustomer.equals("Student"))
        {
            discount=15;
        }
        else if(coustomer.equals("Child"))
        {
            discount=30;
        }
        double basewithsurchagres=basicprice+surcharge+upgrade;
        double adjustedprice=basewithsurchagres*(1+timebased/100);
        double finalprice=adjustedprice*(1-discount/100);
        System.out.println("movie format : "+movieformat);
        System.out.println("Show time : "+showtime);
        System.out.println("Seat category : "+seatcategory);
        System.out.println("Coustomer type : "+coustomer);
        System.out.println("Base ticket price : "+basicprice);
        System.out.println("Format surcharge : "+surcharge);
        System.out.println("Seat upgrade : "+upgrade);
        System.out.println("Time-base adjustment : "+timebased);
        System.out.println("Coustomer discount  : "+discount);
        System.out.println("Final ticket price : "+finalprice);
        System.out.println("Pricing category : "+seatcategory);
    }
}
