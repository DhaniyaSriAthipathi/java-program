import java.util.Scanner;
public class Wage1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        int perDay=sc.nextInt();
        int overTime=sc.nextInt();
        int charge=sc.nextInt();
        int needed=days*perDay;
        int bonus=needed+overTime;
        int weeklyWage=bonus-charge;
        System.out.println(weeklyWage);
    }
}
