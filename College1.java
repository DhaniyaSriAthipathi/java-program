import java.util.Scanner;

public class College1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int register=sc.nextInt();
        int sponsorShip=sc.nextInt();
        int stallRent=sc.nextInt();
        int stage=sc.nextInt();
        int celebrity=sc.nextInt();
        int market=sc.nextInt();
        int remainder=register+sponsorShip+stallRent-stage-celebrity-market;
        System.out.println(remainder);
    }
}
