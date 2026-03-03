import java.util.Scanner;

public class Book1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int copies=sc.nextInt();
        int  costPer=sc.nextInt();
        int editing=sc.nextInt();
        int design=sc.nextInt();
        int distrutor=sc.nextInt();
        int marketing=sc.nextInt();
        int publishing=(copies*costPer)+editing+design-distrutor-marketing;
        System.out.println(publishing);
    }
}
