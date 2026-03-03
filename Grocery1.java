import java.util.Scanner;
public class Grocery1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sale=sc.nextInt();
        int discount=sc.nextInt();
        int gst=sc.nextInt();
        int finalRev=(sale-(sale*discount/100))+((sale-(sale*discount/100))*gst/100);
        System.out.println(finalRev);

    }
    
}
