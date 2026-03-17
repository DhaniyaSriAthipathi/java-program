import java.util.Scanner;

public class While16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num=sc.nextInt();
        int binary=0;
        int remain;
        int i=1;
        while(num!=0)
        {
            remain=(int)num%10;
            binary=binary+remain*i;
            num=num/10;
            i=i*2;
        }
        System.out.println(binary);
    }
}
