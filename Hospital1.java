import java.util.*;
public class Hospital1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int roomCharge=sc.nextInt();
        int days=sc.nextInt();
        int medicine=sc.nextInt();
        int lab=sc.nextInt();
        int coverage=sc.nextInt();
        int finalBill=(roomCharge*days)+medicine+lab-coverage;
        System.out.println(finalBill);
    }
    
}
