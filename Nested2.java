import java.util.Scanner;

public class Nested2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        for(int i=1;i<=row;i++)
        {
            System.out.println("Row "+i+": ");
            for(int j=1;j<=column;j++)
            {
                System.out.print("seat "+j+": ");
            }
            System.out.println(" ");
        }
        System.out.println(row*column);
    }
}
