import java.util.Scanner;

public class Array12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] peak=new double[n];
       //input hours
        for(int i=0;i<n;i++)
        {
            peak[i]=sc.nextDouble();
        }
        double limit=sc.nextDouble();
        double total=0;
        double max=peak[0];
        double peakin=0;
        for(int i=0;i<n;i++)
        {
            total+=peak[i];
            if(peak[i]>max)
            {
                max=peak[i];
                peakin=i;
            }
        }
        double avg=total/n;
         System.out.println("Hours Monitored: " + n);
        System.out.printf("Total Daily Consumption: %.2f kWh\n", total);
        System.out.printf("Peak Hour: Hour %d (%.2f kWh)\n", peakin + 1, max);
        System.out.printf("Average Hourly: %.2f kWh\n", avg);
        System.out.printf("Daily Limit: %.2f kWh\n", limit);
        if(total<=limit)
        {
            System.out.println("Withint limit");
        }
        else
            System.out.printf("Exceeded %.2f : ",total-limit);
    }
}
