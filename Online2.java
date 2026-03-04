import java.util.Scanner;

public class Online2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=(a+b)/2;
        if(a>=60 && b>=60 && sum>=60)
            System.err.println("Pass");
        else
            System.out.println("Fail");
        
    }
}
