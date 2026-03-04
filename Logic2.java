import java.util.Scanner;

public class Logic2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<=1 && b==a && c!=1)
            System.out.println("success");
        else
            System.out.println("failed");

    }
}
