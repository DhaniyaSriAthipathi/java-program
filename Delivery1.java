import java.util.*;
public class Delivery1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int earing=sc.nextInt();
        int payOut=sc.nextInt();
        int incentive=sc.nextInt();
        int fuelCost=sc.nextInt();
        int net=(earing*payOut)+incentive-fuelCost;
        System.out.println(net);
    }
}
