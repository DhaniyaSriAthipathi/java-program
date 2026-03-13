import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int secret=sc.nextInt();
        int guess=-1;
        int attempt=0;
        while(guess!=secret)
        {
            guess=sc.nextInt();
            attempt++;
            System.out.println("Guess number : "+guess);
            if(guess<secret)
            {
                System.out.println("Too low!!");
            }
            else if(guess>secret)
            {
                System.out.println("Too high!!");
            }
            else
                System.out.println("Equal" +attempt);
        }
    }
}
