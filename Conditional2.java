import java.util.Scanner;

public class Conditional2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int score=sc.nextInt();
        int income=sc.nextInt();
        int ratio=sc.nextInt();
        sc.nextLine();
        String load=sc.nextLine();
        int max=0;
        String decision="Rejected";
        if(load.equals("Home"))
        {
            if(score>=750 && ratio <=30){
            decision="approved";
            max=(4*income);}
            else if((score>=650 && score<=749) && (ratio>=31 && ratio <=40))
            {
                decision="need review";
                max=(3*income);
            }
        }
        else if(load.equals("Personal"))
        {
            if(score>=750 && ratio <=30 )
            {
                decision="approved";
                max=income;
            }
            else if((score >=650 && score<=699) && (ratio >=31 && ratio<=40))
            {
                decision="need review";
                max=income/2;
            }
        }
        else if(load.equals("Business"))
        {
            if(score>=750 && ratio <=30 )
            {
                decision="Approved";
                max=3*income;
            }
        }
        else if(score<600 && ratio>50)
        {
            decision="rejected";
            max=0;
        }
        System.out.println("Credit score : "+score);
        System.out.println("annual income : "+income);
        System.out.println("Debt to income ratio : "+ratio);
        System.out.println("loan type : "+load);
        System.out.println("review : "+decision);
        System.out.println("amount : "+max);


    }
}
