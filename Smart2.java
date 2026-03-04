import java.util.Scanner;

public class Smart2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int active=sc.nextInt();
        int inactive=sc.nextInt();
        int result=active & inactive;
        if(result!=0)
            System.out.println("Active");
        else
            System.out.println("Inactive");

    }
}
