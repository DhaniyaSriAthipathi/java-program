import java.util.Scanner;

public class Conditional20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int storage=sc.nextInt();
        int usercount=sc.nextInt();
        sc.nextLine();
        String backup=sc.nextLine();
        String supporttier=sc.nextLine();
        double capacity=0;
        double peruser=0;
        double premium=0;
        double fee=0;
        double plan=0;
        String user="dd";
        if(storage>=10 && storage<=100)
        {
            capacity=0.05;
        }
        else if(storage>=101 && storage<=500)
        {
            capacity=0.05;
        }
        else if(storage>=501 && storage<=2000)
        {
            capacity=0.03;
        }
        else if(storage>=2001)
        {
            capacity=0.02;
        }
        if(usercount>=1 && usercount<=10)
        {
            peruser=5;
        }
        else if(usercount>=11 && usercount<=20)
        {
            peruser=4;
        }
        else if(usercount>=51)
        {
            peruser=3;
        }
        if(backup.equals("Daily"))
        {
            premium=0;
        }
        else if(backup.equals("Hourly"))
        {
            premium=15.50;
        }
        else if(backup.equals("Real-time"))
        {
            premium=51;
        }
        if(supporttier.equals("Community"))
        {
            fee=0;
        }
        else if(supporttier.equals("Standard"))
        {
            fee=20;
        }
        else if(supporttier.equals("Priority"))
        {
            fee=75;
        }
        else if(supporttier.equals("Enterprise"))
        {
            fee=200;
        }
        double total=storage+peruser+premium+fee;
        double annual=total*12*0.9;
        if(plan<=1)
        {
            user="Personal";
        }
        else if(plan>=2 && plan<=20)
        {
            user="Team";
        }
        else if(plan>=21 && plan<=100)
        {
            user="Business";
        }
        else if(plan>=100)
        {
            user="Enterprise";
        }
        System.out.println("Storage capacity : "+capacity);
        System.out.println("User count : "+usercount);
        System.out.println("Backup frequency : "+backup);
        System.out.println("Support tier : "+supporttier);
        System.out.println("Base storage : "+storage);
        System.out.println("Per-user fee : "+peruser);
        System.out.println("Backup premium : "+premium);
        System.out.println("Support fee : "+fee);
        System.out.println("Monthly subscription : "+total);
        System.out.println("Annual subscription : "+annual);
        System.out.println("Recommended plan : "+user);

    }
}
