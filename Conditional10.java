import java.util.Scanner;

public class Conditional10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String timeof=sc.nextLine();
        Double power=sc.nextDouble();
        double percentage=sc.nextDouble();
        sc.nextLine();
        String ratetier=sc.nextLine();
        double dollar=0;
        double mulitplier=0;
        String optimal="Low";
        if(ratetier.equals("Basic"))
        {
            dollar=0.18;
        }
        else if (ratetier.equals("Time of use")) {
            dollar=0.15;
        }
        else if(ratetier.equals("Premium green"))
        {
            dollar=0.12;
        }
        if(mulitplier>=1.5 && mulitplier<=1.8){
            timeof="Peak";
            optimal="Excellent ! Continue";}
        else if(mulitplier>=0.8 && mulitplier<=1.0){
            timeof="Off-peak";
            optimal="Peak usage with low renewable";
        }
        else if(mulitplier>=0.5 && mulitplier<=0.6){
            timeof="Super-off-peak";
            optimal="Peak usage with low renewable";
        }
        double renewable=(power *percentage/100)*dollar;
        double cost=(power*dollar*mulitplier)-renewable;
        System.out.println("Time of day : "+timeof);
        System.out.println("Power consumption : "+power);
        System.out.println("Reneable energy : "+percentage);
        System.out.println("Rate tier : "+ratetier);
        System.out.println("Base rate : "+dollar);
        System.out.println("Rate multipier : "+mulitplier);
        System.out.println("Renewable credits : "+renewable);
        System.out.println("Total cost : "+cost);
        System.out.println("Optimization recommandation : "+optimal);

        
    }
}
