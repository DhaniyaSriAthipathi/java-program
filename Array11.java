import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] a=new double[n];
        double[] b=new double[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextDouble();
        }
        for(int j=0;j<n;j++)
        {
            b[j]=sc.nextDouble();
        }
        double total=0;
        double max=0;
        double min=a[0]*b[0];
        int mini=0;
        int maxi=0;
        for(int i=0;i<n;i++)
        {
            double val=a[i]*b[i];
            total+=val;
            if(val>max)
            {
                max=val;
                maxi=i;
            }
            if(val<mini)
            {
                min=val;
                mini=i;
            }
        }
         System.out.println("Number of Assets: " + n);
        System.out.printf("Total Portfolio Value: $%.2f\n", total);
        System.out.printf("Most Valuable Asset: Asset %d ($%.2f)\n", maxi + 1, max);
        System.out.printf("Least Valuable Asset: Asset %d ($%.2f)\n", mini + 1, min);

    }
}
