import java.util.Scanner;

public class While25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<n)
        {
            if(n%i==0)
            {
                sum+=i;
            }
            i++;
        }
        if(sum==n)
        {
            System.out.println("Perfect");
        }
        else
            System.out.println("Not Perfect");
    }
}
