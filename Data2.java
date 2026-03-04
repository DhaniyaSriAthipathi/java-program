import java.util.Scanner;

public class Data2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int file=sc.nextInt();
        int cycle=sc.nextInt();
        int size=file >> cycle;
        System.out.println(size);
    }
}
