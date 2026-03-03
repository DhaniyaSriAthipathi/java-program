import java.util.Scanner;

public class Smart1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int residential=sc.nextInt();
        int rate=sc.nextInt();
        int commerical=sc.nextInt();
        int comRate=sc.nextInt();
        int connection=sc.nextInt();
        int penalty=sc.nextInt();
        int pipeline=sc.nextInt();
        int treatment=sc.nextInt();
        int net=(residential*rate)+(commerical*comRate)+connection+penalty-pipeline-treatment;
        System.out.println(net);
    }
}
