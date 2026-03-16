import java.util.Scanner;

public class While10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int first=0;
        int second=1;
        int temp=0;
        int i=2;
        if(1<=n)
        {
            System.out.print(first);
        }
        if(2<=n)
        {
            System.out.print(second);
        }
        while(i<n)
        {
            temp=first+second;
            first=second;
            second=temp;
            System.out.print(temp);
            i++;
        }
       
        

    
    }
}
