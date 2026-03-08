import java.util.Scanner;

public class Conditional24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double distancemiles=sc.nextDouble();
        double ordervalue=sc.nextDouble();
        sc.nextLine();
        String timeslot=sc.nextLine();
        String weathercondition=sc.nextLine();
        double basedelivery=3.00;
        double distancesurcharge=1.00;
        double peak=0;
        double surchagre=0;
        double discount=0;
        double delay=0;
        if(timeslot.equals("Breakfast"))
        {
            peak=0;
        }
        else if(timeslot.equals("Lunch"))
        {
            peak=2.50;
        }
        else if(timeslot.equals("Dinner"))
        {
            peak=2.00;
        }
        else if(timeslot.equals("Late-night"))
        {
            peak=1.50;
        }
        if(weathercondition.equals("Clear"))
        {
            surchagre=0;
        }
        else if(weathercondition.equals("Rain"))
        {
            surchagre=2;
        }
        else if(weathercondition.equals("Snow"))
        {
            surchagre=3;
        }
        else if(weathercondition.equals("Storm"))
        {
            surchagre=5;
        }
        if(ordervalue>=30 && ordervalue<=49.99)
        {
            discount=1;
        }
        else if(ordervalue>=50 && ordervalue<=74.99)
        {
            discount=3;
        }
        else if(ordervalue>=75)
        {
            discount=5;
        }
        double basetime=distancemiles*8;
        if(weathercondition.equals("Rain"))
        {
             delay=+5;
        }
        else if(weathercondition.equals("weathercondition"))
        {
            delay=+10;
        }
        else if(weathercondition.equals("Storm"))
        {
            delay=+15;
        }
        System.out.println("Delivery distance : "+distancemiles);
        System.out.println("Order value : "+ordervalue);
        System.out.println("Time slot : "+timeslot);
        System.out.println("Weather condition : "+weathercondition);
        System.out.println("Base delivery fee : "+basedelivery);
        System.out.println("Distance surcharge : "+distancesurcharge);
        System.out.println("Peak time surcharge : "+surchagre);
        System.out.println("Weather surcharge : "+peak);
        System.out.println("Order value discount : "+discount);
        System.out.println("Final delivery fee : "+basetime);
        System.out.println("Esimated delivery time : "+delay);

    }
}
