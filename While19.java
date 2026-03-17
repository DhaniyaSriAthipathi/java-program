import java.util.Scanner;

public class While19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int orginal=n;
        int sum=0;
        while(n>0)
        {
            int d=n%10;
            int fact=1;
            for(int i=1;i<=d;i++)
                fact=fact*i;
             sum=sum+fact;
              n=n/10;}

            if(sum==orginal)
            {
                System.out.println("Strong");
            }
            else 
                System.out.println("NOT");
        
    }
}
