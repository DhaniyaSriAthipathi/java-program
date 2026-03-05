import java.util.Scanner;

public class Conditional5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double gpa=sc.nextDouble();
        double income=sc.nextDouble();
        int score=sc.nextInt();
        sc.nextLine();
        String schlorship=sc.nextLine();
        int amt=0;
        String award="Partial";
        if(schlorship.equals("Merit"))
        {
            if(gpa >=3.8 && score>=80)
            {
                amt=25000;
                award="Full";
            }
            else if(gpa>=3.5 && score>=70)
            {
                amt=15000;
                award="Partial";
            }
            else if(gpa >=3.0 && score >=60)
            {
                amt=8000;
                award="Minimal";
            }
        }
        else if(schlorship.equals("Need-Based"))
        {
            if(income<=30000 && gpa>=3.5)
            {
                amt=30000;
                award="Full";
            }
            else if(income<=50000 && gpa>=3.0)
            {
                amt=18000;
                award="Partial";
            }
            else if(income<=70000 && gpa>=2.8)
            {
                amt=10000;
                award="Minimal";
            }
        }
        else if(schlorship.equals("Sports"))
        {
            if(score>=85 && gpa>=3.0)
            {
                amt=22000;
                award="Full";
            }
            else if(score>=75 && gpa>=2.8)
            {
                amt=20000;
                award="Partial";
            }
            else if(score>=65 && gpa>=2.5)
            {
                amt=12000;
                award="Minimal";
            }
        }
        System.out.println("GPA : "+gpa);
        System.out.println("Family income : "+income);
        System.out.println("Extracurricular score : "+score);
        System.out.println("Scholarship Tpye : "+schlorship);
        if(gpa>=2.5)
            System.out.println("eligible");
        else 
            System.out.println("Not eligible");
        System.out.println("Award amount : "+amt);
        System.out.println("Award category : "+award);
    }
}
