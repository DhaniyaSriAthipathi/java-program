import java.util.Scanner;

public class While6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int balance=sc.nextInt();
        int remaining=0;
        while (balance>0) {
            int withdrawal=sc.nextInt();
            if(balance<withdrawal)
            {
                System.out.println("Insuffcient funds!Try again.");
                break;
            }
            else{
                remaining=balance-withdrawal;
                System.out.println("Withdrawal successful!!");
                System.out.println("Remaining amount : "+remaining);
            }
        }
    }
}
