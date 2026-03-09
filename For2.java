import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        char letter='A';
        sc.nextLine();
        String status="ss";
        int highscore=0;
        int count=0;
        int max=0;
        for(int i=0;i<=n;i++){
        String studentName=sc.nextLine();
        int score=sc.nextInt();
        highscore=Math.max(highscore,score);
        if(score>=85 && score<=100)
            letter='A';
        else if(score>=70 && score<=84)
            letter='B';
        else if(score>=60 && score<=69)
            letter='C';
        else if(score>=50 && score<=68)
            letter='D';
        else if(score>=0 && score<=49)
            letter='E';
        if(score>=60){
            status="Pass";
            count++;}
        else{
            status="Fail";
            max++;}
            int avaerage=score/n;
            System.out.println("Student name : "+studentName);
            System.out.println("Score : "+score);
            System.out.println("Letter grade : "+letter);
            System.out.println("Status : "+status);
            System.out.println("Total students : "+n);
            System.out.println("Class average : "+avaerage);
            System.out.println("Highest score : "+highscore);
            System.out.println("Student passed : "+count);
            System.out.println("Student failed : "+max);
}}
}
