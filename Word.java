import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
       
       
        if(a.length()>b.length())
        {
            System.out.println("big words : "+a);
        }
        else if(b.length()>a.length())
        {
            System.out.println("Big  word:"+b);
        }
        else
            System.out.println("Both are equal");

    }
}
