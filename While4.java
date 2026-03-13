import java.util.Scanner;

public class While4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int values=sc.nextInt();
        int fact=1;
        int i=1;
        while(i<=values)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial : "+fact);
    }
}
