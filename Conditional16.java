import java.util.Scanner;
public class Conditional16 {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String roomcategory=sc.nextLine();
    String season =sc.nextLine();
    int nightbooked=sc.nextInt();
    sc.nextLine();
    String loyaltytier=sc.nextLine();
    int rate=0;
    double mulitpler=0;
    int discount=0;
    int loyal=0;
    if(roomcategory.equals("Standard"))
    {
        rate=150;
    }
    else if(roomcategory.equals("Deluxe"))
    {
        rate=300;
    }
    else if(roomcategory.equals("Suite"))
    {
        rate=500;
    }
    else if(roomcategory.equals("Presidentail"))
    {
        rate=1000;
    }
    if(season.equals("Off-peak"))
    {
        mulitpler=0.7;
    }
    else if(season.equals("Regular"))
    {
        mulitpler=1.0;
    }
    else if(season.equals("Peak"))
    {
        mulitpler=1.5;
    }
    else if(season.equals("Holiday"))
    {
        mulitpler=2.0;
    }
    if(nightbooked>=1 && nightbooked<=4)
    {
        discount=0;
    }
    else if(nightbooked>=5 && nightbooked<=7)
    {
        discount=5;
    }
    else if(nightbooked>=8 && nightbooked<=14)
    {
        discount=10;
    }
    else if(nightbooked>=15)
    {
        discount=20;
    }
    if(loyaltytier.equals("None"))
    {
        loyal=0;
    }
    else if(loyaltytier.equals("Member"))
    {
        loyal=10;
    }
    else if(loyaltytier.equals("Gold"))
    {
        loyal=15;
    }
    else if(loyaltytier.equals("Platinum"))
    {
        loyal=20;
    }
    double seasonrate=rate*mulitpler;
    double  discountrate=seasonrate*(1-discount/100)*(1-loyal/100);
    double totalcost=discountrate*nightbooked;
    System.out.println("Room category :"+roomcategory);
    System.out.println("Season : "+season);
    System.out.println("Night booked : "+nightbooked);
    System.out.println("Loyalty tier : "+loyaltytier);
    System.out.println("Nighthy rate : "+rate);
    System.out.println("Seasonal mulitpier : "+mulitpler);
    System.out.println("Extended stay discount : "+discount);
    System.out.println("Loyalty discount : "+loyal);
    System.out.println("Nightly rate : "+discountrate);
    System.out.println("Total booking cost : "+totalcost);
    System.out.println("Complimentary upgrades : "+loyaltytier);
 }   
}
