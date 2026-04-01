import java.util.Scanner;

public class Array14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] a=new double[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextDouble();
        }
        double total=0;
        double max=a[0];
        int maxi=0;
        for(int i=0;i<n;i++)
        {
            total+=a[i];
        
        if(a[i]>max)
        {
            max=a[i];
            maxi=i;
        }
    }
    double avg = total / n;
        double threshold = avg * 0.8;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<threshold)
            {
                count++;
            }
        }
         System.out.println("Total Plots: " + n);
        System.out.printf("Total Harvest: %.2f tons\n", total);
        System.out.printf("Average Yield: %.2f tons/acre\n", avg);
        System.out.printf("Highest Yield: %.2f tons/acre (Plot %d)\n", max, maxi + 1);
        System.out.println("Underperforming Plots: " + count);
        System.out.printf("Performance Threshold: %.2f tons/acre\n", threshold);
    }
    }
