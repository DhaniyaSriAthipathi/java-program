import java.util.Scanner;

public class Nested4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        for(int i=1;i<=row;i++)
        {
            sc.nextLine();
            String name=sc.nextLine();
            for(int j=1;j<=column;j++)
            {
                int score=sc.nextInt();
                sum=sum+score;
                average=sum/j;
                

            }
        }
    }
}
