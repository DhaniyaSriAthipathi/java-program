import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size : ");
        int n=sc.nextInt();
         System.out.print("Enter element : ");
        int[]a=new int[n];
        for(int i=0;i<n;i++)
        {
           
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[j]==a[i])
                {
                    System.out.println("Duplicate element : ");
                    System.out.println(a[i]+" ");
                    break;
                }
            }
        }
    }
}
