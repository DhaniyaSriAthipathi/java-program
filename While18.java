import java.util.Scanner;

public class While18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        long binary=0;
        int remain;
        int i=1;
        while(num!=0)
        {
            remain=num%2;
            num=num/2;
            binary=binary+remain*i;
            i=i*10;
        }
        System.out.println(binary);
    }
}
