import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.nextLine();
        String password=sc.nextLine();
        int attempt=3;
        while(attempt>0)
        {
            System.out.println("Enter passwoed : ");
            String user=sc.nextLine();
            if(password.equals(user))
            {
                System.out.println("Access");
            }
            else
            {
                attempt--;
                if(attempt==0)
                {
                    System.out.println("locked");
                }
                else 
                {
                    System.out.println("Incorrect" +attempt);
                }
            }}

        }}
