import java.util.Scanner;

public class While13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=1;
        int i=1;
        while(i<=b)
        {
            result=result*a;
            i++;
        }
        System.out.println(result);
    }
}
