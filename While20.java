import java.util.Scanner;

public class While20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i=1;
        do{
           System.out.println(a*i);
           i++;
        }
        while(i<=b);
    
    }
}
