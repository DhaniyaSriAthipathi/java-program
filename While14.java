import java.util.Scanner;

public class While14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int count=0;
        int temp=n;
        while(temp!=0)
        {
            count++;
            temp=temp/10;
        }
        int sum=0;
        while(n!=0)
        {
            int rem=n%10;
            int pow=1;
        
            for(int i=0;i<count;i++)
            {
               pow=pow*rem; 
            }
            sum=sum+pow;
            n=n/10;
        }
        if(original==sum)
        {
            System.out.println("Amstrong");
        }
        else 
            System.out.println("Not amstrong");
    
    }
}
