import java.util.Scanner;

public class Conditional11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ordertype=sc.nextLine();
        String loyalty=sc.nextLine();
        Double ordervalue=sc.nextDouble();
        String timeslot=sc.nextLine();
        double percent=0;
        double adjustment=0;
        double element=0;
        sc.nextLine();
        String con="Low";
        if(loyalty.equals("Gold"))
        {
            percent=15;
        }
        else if(loyalty.equals("Silver"))
        {
            percent=10;
        }
        else if(loyalty.equals("Bronze"))
        {
            percent=5;
        }
        else if(loyalty.equals("None"))
        {
            percent=0;
        }
        if(timeslot.equals("Peak"))
        {
            adjustment=+0;
            con="High";
        }
        else if(timeslot.equals("Regular"))
        {
            adjustment=+0;
            con="Medium";
        }
        else if(timeslot.equals("Late-night"))
        {
            adjustment=-5;
            con="Low";
        }
        if(ordertype.equals("Delivery"))
        {
            element=10;
        }
        else if(ordertype.equals("Takeout"))
        {
            element=3;
        }
        else if(ordertype.equals("Dine-in"))
        {
            element=0;
        }
        double discount=ordervalue*(1-percent/100);
        double finalamount=discount+element;
        System.out.println("Order type : "+ordertype);
        System.out.println("Loyalty Status : "+loyalty);
        System.out.println("Order value : "+ordervalue);
        System.out.println("Time slot : "+timeslot);
        System.out.println("Base dicount : "+percent);
        System.out.println("Time based adjustment : "+adjustment);
        System.out.println("Service fee : "+element);
        System.out.println("Final amount : "+finalamount);
        System.out.println("Kicthen priority : "+con);
       
    }
}
