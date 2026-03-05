import java.util.Scanner;

public class Conditional3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        sc.nextLine();
        String status=sc.nextLine();
        String conditions=sc.nextLine();
        String tier=sc.nextLine();
        int basic=0;
        int risk=0;
        if(age>=18 && age<=30)
        {
            if(tier.equals("Basic"))
            {basic=200;}
            else if(tier.equals("Standard"))
            {
                basic=300;
            }
            else if(tier.equals("Premium"))
            {
                basic=500;
            }
        }
        else if(age>=31 && age<=50)
        {
            if(tier.equals("Basic"))
            {
                basic=250;
            }
            else if(tier.equals("Standard"))
            {
                basic=350;
            }
            else if(tier.equals("Premium"))
            {
                basic=600;
            }
        }
        else if(age >=51 && age <=65)
        {
            if(tier.equals("Basic"))
            {
                basic=350;
            }
            else if(tier.equals("Standard"))
            {
                basic =450;
            }
            else if(tier.equals("Premium"))
            {
                basic=700;
            }
        }
        else if(age>=66 && age<=100)
        {
            if(tier.equals("Basic"))
            {
                basic=400;
            }
            else if(tier.equals("Standard"))
            {
                basic=550;
            }
            else if(tier.equals("Premium"))
            {
                basic=800;
            }}
        if(status.equals("Smoker") && conditions.equals("Yes"))
        {
            risk=basic*40/100;
        }
        else if(status.equals("Smoker"))
        {
            risk=basic*30/100;
        }
        else if(conditions.equals("Yes"))
        {
            risk=basic*70/100;
        }
        int monthly=basic+risk;
        System.out.println("Age : "+age);
        System.out.println("Smoking status : "+status);
        System.out.println("Pre-existing Condition : "+conditions);
        System.out.println("Coverage Tier : "+tier);
        System.out.println("Base premium : "+basic);
        System.out.println("Risk surcharge : "+risk);
        System.out.println("Total Monthly : "+monthly);
    }}

