import java.util.Scanner;

public class Bank2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>25000 && b>700)
            System.out.println("Loan Approved");
        else
            System.out.println("Loan rejected");
    }
}
