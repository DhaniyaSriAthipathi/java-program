import java.util.Scanner;

public class While21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;
        while(a<=b)
        {
            if(a%2==0)
            {
                sum=sum+a;
            }
            a++;
        }
        System.out.println(sum);
    }
}
