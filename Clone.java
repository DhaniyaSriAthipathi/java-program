import java.util.ArrayList;
import java.util.Scanner;

public class Clone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements : ");
        int n=sc.nextInt();
        ArrayList<Integer> list1=new ArrayList<>();
        System.out.println("enter value:");
        for(int i=0;i<n;i++)
        {
            list1.add(sc.nextInt());
        }
        ArrayList<Integer> list2=(ArrayList<Integer>) list1.clone();
        System.out.println(list1);
        System.out.println(list2);

    }
    
}
