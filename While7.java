import java.util.Scanner;

public class While7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("--Calculator menu--");
            System.out.println("1.Add");
            System.out.println("2.Sub");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");
            System.out.println("Exit");
            choice=sc.nextInt();
            if(choice>=1 && choice<=4)
            {
                System.out.println("Enter first number : ");
                double num1=sc.nextDouble();
                System.out.println("Enter second number : ");
                double num2=sc.nextDouble();
                double result=0;
                switch ((choice)) {
                    case 1:
                        result=num1+num2;
                        System.out.printf("%.2f",result);
                        break;
                    case 2:
                        result=num1-num2;
                        System.out.printf("%.2f",result);
                        break;
                    case 3:
                        result=num1*num2;
                        System.out.printf("%.2f",result);
                        break;
                    case 4:
                        if(num2!=0)
                            {
                                result=num1/num2;
                                System.out.printf(".%2f",result);
                                break;
                            }    
                            else{
                                System.out.println("Invaild");}
                            break;
                
                }

            }
            else if(choice!=5)
            {
                System.out.println("goodbye");
            }
        }
        while(choice!=5);
    }
}
