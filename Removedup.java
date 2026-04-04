import java.util.Scanner;

public class Removedup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] temp=new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            int j;
            for(j=0;j<k;j++)
            {
                if(arr[i]==temp[j])
                {
                    break;
        }}
                if(j==k)
                {
                    temp[k]=arr[i];
                    k++;
                }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(temp[i]+" ");
        }
        }
    }

