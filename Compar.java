import java.util.Scanner;

public class Compar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word1=sc.nextLine();
        String word2=sc.nextLine();
        System.out.println(word1.equalsIgnoreCase(word2));
    }
}
