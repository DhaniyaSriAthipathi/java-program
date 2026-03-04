import java.util.Scanner;

public class Ecommerce2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>999 || b==1)
            System.out.println("Free Shipping");
        else
            System.out.println("Charge Applied");
    }
}
