import java.util.Scanner;

public class Government2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<200000 && b>=75)
            System.out.println("Scholarship Granted");
        else
            System.out.println("Not Granted");
    }
}
