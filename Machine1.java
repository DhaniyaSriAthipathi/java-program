import java.util.Scanner;
public class Machine1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rods=sc.nextInt();
        int hours=sc.nextInt();
        int overTime=sc.nextInt();
        int rejected=sc.nextInt();
        int finalProduct=(rods*hours)+overTime-rejected;
        System.out.println(finalProduct);
    }
}
