import java.util.Scanner;

public class While15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        do{
            if(n%2==0)
            {
                n=n/2;
            }
            else{
                n=3*n+1;
            }
            System.out.println(n);
        }
        while(n!=1);
            
    }
}
