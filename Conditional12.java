import java.util.Scanner;

public class Conditional12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        sc.nextLine();
        String vehicle=sc.nextLine();
        String driving=sc.nextLine();
        String level=sc.nextLine();
        String con="e";
        int premium=0;
        double factor=0;
        double rest=0;
        double record=0;
        if(level.equals("Basic"))
        {
            premium=500;
        }
        else if(level.equals("Standard"))
        {
            premium=800;
        }
        else if(level.equals("Comprehensive"))
        {
            premium=1500;
        }
        if(age>=16 && age <=21)
        {
            factor=1.8;
        }
        else if(age>=22 && age<=25)
        {
            factor=1.5;
        }
        else if(age>=26 && age <=40)
        {
            factor=1.0;
        }
        else if(age>=41 && age <=60)
        {
            factor=0.9;
        }
        else if(age >=61)
        {
            factor=1.1;
        }
        if(vehicle.equals("Sedan"))
        {
            rest=1.0;
        }
        else if(vehicle.equals("SUV"))
        {
            rest=1.2;
        }
        else if(vehicle.equals("Sports"))
        {
            rest=1.5;
        }
        else if(vehicle.equals("Truck"))
        {
            rest=1.1;
        }
        if(driving.equals("Clean"))
        {
            record=-10;
            con="Low";
        }
        else if(driving.equals("Minor-violations"))
        {
            record=+25;
            con="Medium";
        }
        else if(driving.equals("Major-violations"))
        {
            record=+50;
            con="High";
        }
        double adjusted=premium*factor*rest;
        double finalpremium=adjusted*(1+record/100);
        double monthly=finalpremium/12;
        System.out.println("Driving age : "+age);
        System.out.println("Vehicla type : "+vehicle);
        System.out.println("Driving record : "+driving);
        System.out.println("Coverage level : "+level);
        System.out.println("Base premium : "+premium);
        System.out.println("Age factor : "+factor);
        System.out.println("Vehicle risk factor : "+rest);
        System.out.println("Monthly premium : "+record);
        System.out.println("Annual premium : "+monthly);
        System.out.println("Risk category : "+con);

    }
}
