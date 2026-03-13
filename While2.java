import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int values=sc.nextInt();
        int sum=0;
        int count=0;
        while(values>0)
        {
            System.out.println("Enter number(0 to stop):");
            int number=sc.nextInt();
            sum+=number;
            if(number==0)
            {
                break;
            }
            count++;
        }
        System.out.println("Total sum : "+sum);
        System.out.println("Count : "+count);
    }
}
