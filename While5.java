import java.util.Scanner;

public class While5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int digit=0;
        while(n!=0)
        {
            rev=n%10;
            digit=digit*10+rev;
            n=n/10;
        }
        System.out.println("Reverse : "+digit);
    }
}
