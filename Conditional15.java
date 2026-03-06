import java.util.Scanner;

public class Conditional15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        sc.nextLine();
        String license=sc.nextLine();
        String support=sc.nextLine();
        int contract=sc.nextInt();
        int base=0;
        int volume=0;
        int user=0;
        int multi=0;

        if(license.equals("Standard"))
        {
            base=60;
        }
        else if(license.equals("Professional"))
        {
            base=120;
        }
        else if(license.equals("Enterprise"))
        {
            base=200;
        }
        if(count>=1 && count<=50)
        {
            volume=0;
        }
        else if(count>=51 && count<=200)
        {
            volume=15;
        }
        else if(count>=201 && count <=500)
        {
            volume=20;
        }
        else if(count>=501 && count<=1000)
        {
            volume=25;
        }
        else if(count>=1001)
        {
            volume =35;
        }
        if(support.equals("Basic"))
        {
            user=10;
        }
        else if(support.equals("Priority"))
        {
            user=30;
        }
        else if(support.equals("Premium"))
        {
            user=80;
        }
        if(contract==1)
        {
            multi=0;
        }
        else if(contract==2)
        {
            multi=5;
        }
        else if(contract==3)
        {
            multi=10;
        }
        else if(contract==5)
        {
            multi=20;
        }
        int discounted=base*(1-volume/100);
        int totalamount=discounted*count;
        int contractvalue=totalamount*contract;
        System.out.println("User count : "+count);
        System.out.println("Lincense type : "+license);
        System.out.println("Support level : "+support);
        System.out.println("Contract duration : "+contract);
        System.out.println("Base price per user : "+base);
        System.out.println("Volume : "+volume);
        System.out.println("Support fee per user : "+user);
        System.out.println("Multi-year discount : "+multi);
        System.out.println("Annual cost per user : "+discounted);
        System.out.println("Total annual cost : "+totalamount);
        System.out.println("Total contract value : "+contractvalue);

    }
}
