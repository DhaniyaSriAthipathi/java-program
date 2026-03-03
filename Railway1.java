import java.util.Scanner;

public class Railway1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int passengers=sc.nextInt();
        int generalFare=sc.nextInt();
        int acpassengers=sc.nextInt();
        int acFare=sc.nextInt();
        int platform=sc.nextInt();
        int maintenance=sc.nextInt();
        int fuel=sc.nextInt();
        int trian=(passengers*generalFare);
        int ac=(acpassengers*acFare);
        int netRailway=(trian)+(ac)+platform-maintenance-fuel;
        System.out.println(netRailway);

    }
}
