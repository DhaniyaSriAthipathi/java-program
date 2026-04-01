import java.util.Scanner;

public class Array15 {
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
        int min=a[0];
        int exceed=0;
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
            if(a[i]<min){
                min=a[i];}
            if(a[i]>max)
            {
                max=a[i];
            }
            if(a[i]>300)
            {
                exceed++;
            }
        }
         double avg = (double) sum / n;

        // compliance calculation
        double compliance = ((double)(n - exceed) / n) * 100;
        System.out.println("Total Calls: " + n);
        System.out.printf("Average Handling Time: %.2f seconds\n", avg);
        System.out.println("Shortest Call: " + min + " seconds");
        System.out.println("Longest Call: " + max + " seconds");
        System.out.println("Calls Exceeding Target (300s): " + exceed);
        System.out.printf("Target Compliance: %.2f%%\n", compliance);
    }
}
