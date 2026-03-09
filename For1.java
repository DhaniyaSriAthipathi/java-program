import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double totalpay=0;
        double increment=0;
        for(int i=0;i<n;i++)
        {
            sc.nextLine();
        String employessName=sc.nextLine();
        double baseSalary=sc.nextDouble();
         int Performance =sc.nextInt();
         if(Performance==5)
            increment=15;
        else if(Performance==4)
            increment=10;
        else if(Performance==3)
            increment=5;
        else if(Performance==2)
            increment=2;
        else if(Performance==1)
            increment=0;
        double finalSalary=baseSalary*(1+increment/100);
        totalpay+=finalSalary;
        System.out.println("Employess name : "+employessName);
        System.out.println("Base salary : "+baseSalary);
        System.out.println("Performance : "+Performance);
        System.out.println("Increment : "+increment);
        System.out.println("Final salary : "+finalSalary);
        double average=totalpay/n;
        System.out.println("Total employee : "+n);
        System.out.println("Total payroll : "+totalpay);
        System.out.println("avaerage salary : "+average);

        }
    }
}
