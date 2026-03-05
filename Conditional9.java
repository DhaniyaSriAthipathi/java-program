import java.util.Scanner;

public class Conditional9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double annual=sc.nextDouble();
        sc.nextLine();
        String business=sc.nextLine();
        double expenses=sc.nextDouble();
        double tax=sc.nextDouble();
        int percent=0;
        double taxable=annual-expenses;
        if(business.equals("C-corp"))
        {
            if(taxable<500000)
            {
                percent=21;
            }
            else if(taxable>=500000 && taxable<1000000)
            {
                percent=24;
            }
            else if(taxable>=1000000 && taxable<2000000)
            {
                percent=28;
            }
            else if(taxable>=2000000)
            {
                percent=30;
            }
        }
        else if(business.equals("S-corp"))
        {
            if(taxable<500000)
            {
                percent =20;
            }
            else if(taxable>=500000 && taxable<1000000)
            {
                percent=25;
            }
            else if(taxable>=1000000)
            {
                percent=28;
            }
        }
        else if(business.equals("LLC"))
        {
            if(taxable<200000)
            {
                percent=20;
            }
            else if(taxable>=200000 && taxable<500000)
            {
                percent=18;
            }
            else if(taxable>500000)
            {
                percent=28;
            }
        }
        else if(business.equals("Partnership"))
        {
            if(taxable<300000)
            {
                percent=18;
            }
            else if(taxable>=300000 && taxable<800000)
            {
                percent=22;
            }
            else if(taxable>800000)
            {
                percent=26;
            }}
            double gross=tax*percent/100;
            double net =gross-tax;
            double effective=(net/annual)*100;
            System.out.println("Annual revenue : "+annual);
            System.out.println("business tpye : "+business);
            System.out.println("Deductible expenses : "+expenses);
            System.out.println("Tax credits : "+tax);
            System.out.println("Taxable income : "+taxable);
            System.out.println("Tax rate : "+percent);
            System.out.println("Gross tax : "+gross);
            System.out.println("Net tax after credits : "+net);
            System.out.println("Effective tax rate : "+effective);
    }
}
