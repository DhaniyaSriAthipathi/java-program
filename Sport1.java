import java.util.Scanner;

public class Sport1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int team=sc.nextInt();
        int broad=sc.nextInt();
        int sponsorShip=sc.nextInt();
        int prize=sc.nextInt();
        int statium=sc.nextInt();
        int ad=sc.nextInt();
        int remaining=team+broad+sponsorShip-prize-statium-ad;
        System.out.println(remaining);
    }
}
