import java.util.Scanner;
public class Student1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fees=sc.nextInt();
        int scholar=sc.nextInt();
        int exam=sc.nextInt();
        int lib=sc.nextInt();
        int finalPay=(fees-(scholar/100)-exam-lib);
        System.out.println(finalPay);
    }
    
}
