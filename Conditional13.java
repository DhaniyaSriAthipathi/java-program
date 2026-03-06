import java.util.Scanner;

public class Conditional13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String student=sc.nextLine();
        int credit=sc.nextInt();
        sc.nextLine();
        String program=sc.nextLine();
        String residency=sc.nextLine();
        double tution =0;
        double mulitplier=0;
        double status=0;
        double fee=0;
        if(program.equals("Undergraduate"))
        {
            tution=350;
        }
        else if(program.equals("Graduate"))
        {
            tution=550;
        }
        else if(program.equals("Professional"))
        {
            tution=800;
        }
        if(residency.equals("In-state"))
        {
            mulitplier=1.0;
        }
        else if(residency.equals("Out-of-state"))
        {
            mulitplier=2.5;
        }
        else if(residency.equals("International"))
        {
            mulitplier=3.0;
        }
        if(student.equals("Full-time"))
        {
            if(program.equals("Undergraduate"))
            {
                status=300;
            }
             else if(program.equals("Graduate"))
             {
                status=750;
             }
              else if(program.equals("Professional"))
              {
                status=1200;
              }
        }
        else if(student.equals("Part-time"))
        {
             if(program.equals("Undergraduate"))
            {
                status=300;
            }
             else if(program.equals("Graduate"))
             {
                status=750;
             }
              else if(program.equals("Professional"))
              {
                status=900;
              }

        }
        else
            status=150;
        double tutioncost=credit*tution*mulitplier;
        double totalfee=tutioncost+status+fee;
        System.out.println("Student status : "+status);
        System.out.println("Credits hours : "+credit);
        System.out.println("Program type : "+program);
        System.out.println("Residency : "+residency);
        System.out.println("Base tution per credits : "+tution);
        System.out.println("Residency Multiplier : "+mulitplier);
        System.out.println("Program fee : "+status);
        System.out.println("total register fee : "+totalfee);
        
    }
}
