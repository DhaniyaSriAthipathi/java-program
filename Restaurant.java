import java.util.Scanner;
public class Restaurant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bill=sc.nextInt();
        int service=sc.nextInt();
        int gst=sc.nextInt();
        int people=sc.nextInt();
        int amount=((bill+(service/100)+(gst/100))/people);
        System.out.println(amount);
    }
    
}
