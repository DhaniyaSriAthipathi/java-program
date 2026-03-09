import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String stock="";
        double reorder=0;
        int count=0;
        int max=0;
        double total=0;
        for(int i=0;i<n;i++)
        {
            String productname=sc.nextLine();
            int currentstock=sc.nextInt();
            int minimum=sc.nextInt();
            if(currentstock>=minimum){
                stock="Adequate";
                reorder=0;
            
            }
            else if(currentstock<minimum && currentstock>=minimum/2){
                stock="Low Stock";
                reorder=(minimum-currentstock)+minimum/2;
                count++;
            
            }

            else if(currentstock<minimum/2){
                stock="Critcal";
                reorder=(minimum-currentstock)+minimum*1.5;
                max++;
            
            }
            total+=reorder;
                System.out.println("Product : "+productname);
                System.out.println("Current stock : "+currentstock);
                System.out.println("Minimum Stock : "+minimum);
                System.out.println("Status : "+stock);
                System.out.println("Reorder : "+reorder);
                
                System.out.println("Total product : "+n);
                System.out.println("Low Stock item  : "+count);
                System.out.println("Critical : "+max);
                System.out.println("Total reorder : "+total);
        
    }}
}
