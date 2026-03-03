import java.util.Scanner;
public class Gym1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int baseSalary=sc.nextInt();
        int session=sc.nextInt();
        int pay=sc.nextInt();
        int bonus=sc.nextInt();
        int maintenance=sc.nextInt();
        int salary=baseSalary+(session*pay)+bonus-maintenance;
        System.out.println(salary);
    }
}
