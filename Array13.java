import java.util.Scanner;

public class Array13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=0;
        int max=a[0];
        int ontime=0;
        int comp=0;
        //main logic
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
            if(a[i]>max)
            {
                max=a[i];
            }
            if(a[i]<=15)
            {
                ontime++;
            }
            if(a[i]>180)
            {
                comp++;
            }
        }
         double avg = (double) sum / n;
        double performance = ((double) ontime / n) * 100;

        // output
        System.out.println("Total Flights: " + n);
        System.out.printf("Average Delay: %.2f minutes\n", avg);
        System.out.println("Maximum Delay: " + max + " minutes");
        System.out.println("On-Time Flights: " + ontime);
        System.out.println("Compensation Required: " + comp);
        System.out.printf("On-Time Performance: %.2f%%\n", performance);

    }
}
