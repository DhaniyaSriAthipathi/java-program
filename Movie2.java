import java.util.Scanner;

public class Movie2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int age=sc.nextInt();
        int proof=sc.nextInt();
        if(age>=18 && proof==1)
            System.out.println("Allowed");
        else
            System.out.println("Denied");
    }
}
