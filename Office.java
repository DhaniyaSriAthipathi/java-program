import java.util.Scanner;
public class Office {
    public static void main(String[] args) {
        Scanner si=new Scanner(System.in);
        int basic=si.nextInt();
        int hr=si.nextInt();
        int bonus=si.nextInt();
        int tax=si.nextInt();
        int pf=si.nextInt();
        int salary=basic+hr+bonus-tax-pf;
        System.out.println(salary);

    }
    
}
