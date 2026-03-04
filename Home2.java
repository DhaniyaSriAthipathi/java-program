import java.util.Scanner;

public class Home2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int unit=sc.nextInt();
        int voltage=sc.nextInt();
        if(unit>500 || voltage==1)
            System.out.println("Alter");
        else
            System.out.println("Normal");

    }
}
