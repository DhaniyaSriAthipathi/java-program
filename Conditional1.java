import java.util.Scanner;

public class Conditional1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter rating :");
        int rate=sc.nextInt();
        System.out.println("Enter year :");
        int year=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter department :");
        String department=sc.nextLine();
        System.out.println("Enter Salary :");
        int salary=sc.nextInt();
        int percentage=0;
        if(department.equals("Critcal") ){
        if(rate==5 && year>=5)
            percentage=25;
        else if(rate==4 && year>=10)
            percentage=22;
        else if(rate==4)
           percentage=15;
        else if(rate==3)
           percentage=10;
        }
    else if(department.equals("Non=Critical"))
    {
        if(rate==5)
            percentage=18;
        else if(rate==4)
            percentage=12;
        else if(rate==3)
           percentage=8;
    }
        System.out.println(percentage);
    int bonus=(salary*percentage)/100;
     System.out.println("Performance : " +rate);
    System.out.println("service :"+year);
    System.out.println("Dpart :"+department);
    System.out.println("Percent :"+percentage);
    System.out.println("Amount :"+bonus);
    if(rate>=3)
        System.out.println("Eligible");
    else
        System.out.println("Not eligible");
 }
}
