import java.util.Scanner;
public class Conditional23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stockPercentage = sc.nextInt();
        int investmentYears = sc.nextInt();
        sc.nextLine(); 
        String riskTolerance = sc.nextLine();
        String marketVolatility = sc.nextLine();
        int bondPercentage = 100 - stockPercentage;
        int riskScore = stockPercentage;
        if (investmentYears >= 1 && investmentYears <= 5) {
            if (stockPercentage > 50) {
                riskScore += 20;
            }
        } 
        else if (investmentYears >= 6 && investmentYears <= 10) {
            if (stockPercentage > 60) {
                riskScore += 10;
            }
        } 
        else if (investmentYears >= 11 && investmentYears <= 20) {
            if (stockPercentage > 80) {
                riskScore += 5;
            }
        }
        if (marketVolatility.equals("Medium")) {
            riskScore += 10;
        } 
        else if (marketVolatility.equals("High")) {
            riskScore += 20;
        }
        if (riskScore > 100) {
            riskScore = 100;
        }
        String riskCategory;
        if (riskScore <= 30) {
            riskCategory = "Low";
        } 
        else if (riskScore <= 60) {
            riskCategory = "Moderate";
        } 
        else if (riskScore <= 80) {
            riskCategory = "High";
        } 
        else {
            riskCategory = "Very High";
        }

        String alignment = "";
        String recommendation = "";
        String rebalancing = "";
        if (riskTolerance.equals("Conservative")) {
            if (riskCategory.equals("Low")) {
                alignment = "Well Aligned";
                recommendation = "Portfolio is appropriately balanced for your profile";
                rebalancing = "No action needed";
            }
            else if (riskCategory.equals("Moderate")) {
                alignment = "Acceptable";
                recommendation = "Risk slightly higher but manageable";
                rebalancing = "Monitor portfolio regularly";
            }
            else {
                alignment = "Misaligned";
                recommendation = "Portfolio risk significantly exceeds tolerance level";
                rebalancing = "Reduce stocks to 30-40%, increase bonds and cash";
            }
        }
        else if (riskTolerance.equals("Moderate")) {
            if (riskCategory.equals("Moderate")) {
                alignment = "Well Aligned";
                recommendation = "Portfolio is appropriately balanced for your profile";
                rebalancing = "No action needed";
            }
            else if (riskCategory.equals("Low") || riskCategory.equals("High")) {
                alignment = "Acceptable";
                recommendation = "Portfolio risk slightly different from tolerance";
                rebalancing = "Minor adjustments may be considered";
            }
            else {
                alignment = "Misaligned";
                recommendation = "Portfolio risk too high for moderate tolerance";
                rebalancing = "Reduce stock allocation";
            }
        }
        else if (riskTolerance.equals("Aggressive")) {

            if (riskCategory.equals("High") || riskCategory.equals("Very High")) {
                alignment = "Well Aligned";
                recommendation = "High risk level acceptable given long horizon and tolerance";
                rebalancing = "Monitor closely, consider slight reduction if volatility persists";
            }
            else if (riskCategory.equals("Moderate")) {
                alignment = "Acceptable";
                recommendation = "Moderate risk acceptable but could increase growth";
                rebalancing = "Consider increasing stocks";
            }
            else {
                alignment = "Misaligned";
                recommendation = "Portfolio is too conservative for your risk tolerance";
                rebalancing = "Increase stocks to 80-90% for better growth potential";
            }
        }
        System.out.println("Stock Allocation: " + stockPercentage + "%");
        System.out.println("Bond Allocation: " + bondPercentage + "%");
        System.out.println("Investment Horizon: " + investmentYears + " years");
        System.out.println("Risk Tolerance: " + riskTolerance);
        System.out.println("Market Volatility: " + marketVolatility);
        System.out.println("Portfolio Risk Score: " + riskScore + "/100");
        System.out.println("Risk Category: " + riskCategory);
        System.out.println("Alignment Status: " + alignment);
        System.out.println("Recommendation: " + recommendation);
        System.out.println("Suggested Rebalancing: " + rebalancing);
    }
}