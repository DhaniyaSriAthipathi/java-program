import java.util.Scanner;

public class For4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double totalSales = 0;
        double totalPayout = 0;

        for(int i = 0; i < n; i++)
        {
            String repName = sc.next();
            double salesAmount = sc.nextDouble();

            double rate = 0;
            double bonus = 0;

            if(salesAmount >= 0 && salesAmount <= 40000)
            {
                rate = 5;
                bonus = 0;
            }
            else if(salesAmount <= 80000)
            {
                rate = 8;
                bonus = 0;
            }
            else if(salesAmount <= 100000)
            {
                rate = 10;
                bonus = 0;
            }
            else if(salesAmount <= 150000)
            {
                rate = 12;
                bonus = 2000;
            }
            else
            {
                rate = 15;
                bonus = 3000;
            }

            double commission = salesAmount * (rate / 100);
            double payout = commission + bonus;

            totalSales += salesAmount;
            totalPayout += payout;

            System.out.println("Sales rep : " + repName);
            System.out.println("Sales amount : " + salesAmount);
            System.out.println("Commission rate : " + rate);
            System.out.println("Commission earned : " + commission);
            System.out.println("Bonus : " + bonus);
            System.out.println("Total payout : " + payout);
        }

        System.out.println("Total sales rep : " + n);
        System.out.println("Total sales : " + totalSales);
        System.out.println("Total payout : " + totalPayout);
    }
}