import java.util.Scanner;

public class Conditional7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int heartrate=sc.nextInt();
        int pressure=sc.nextInt();
        double temperature=sc.nextDouble();
        sc.nextLine();
        String severity=sc.nextLine();

        String checkvalue="Life";
        int time=0;

        if(severity.equals("Life-Threatening"))
        {
            if(heartrate<50 || heartrate >130 || pressure >180 || pressure<90 || temperature >103 || temperature>96 ){
                checkvalue="Critical";
                time=0;
            }
            else if(heartrate<50 && heartrate>60 ||heartrate>110 && heartrate<130 || pressure>160 && pressure<180 || pressure>90 && pressure<100 || temperature>101 && temperature<103 || temperature>96 && temperature<97)
                {checkvalue="Urgent";
                    time=20;
                }
            else 
                {checkvalue="Non-urgent";
            time=90;
        }

        }
        else if(severity.equals("Servere"))
        {
             if(heartrate<50 || heartrate >130 || pressure >180 || pressure<90 || temperature >103 || temperature>96 )
                {checkvalue="Critical";
             time=0;}
            else if(heartrate<50 && heartrate>60 ||heartrate>110 && heartrate<130 || pressure>160 && pressure<180 || pressure>90 && pressure<100 || temperature>101 && temperature<103 || temperature>96 && temperature<97)
                {checkvalue="Urgent";
            time=20;}
            else
                {checkvalue="Non-urgent";
            time=20;}
        }
        else if(severity.equals("Moderate"))
        {
            if(heartrate<50 || heartrate >130 || pressure >180 || pressure<90 || temperature >103 || temperature>96 )
                checkvalue="Critical";
            else if(heartrate<50 && heartrate>60 ||heartrate>110 && heartrate<130 || pressure>160 && pressure<180 || pressure>90 && pressure<100 || temperature>101 && temperature<103 || temperature>96 && temperature<97)
                checkvalue="Urgent";
            else
                checkvalue="Non-urgent";
        }
        else if(severity.equals("Mild"))
        {
            if(heartrate<50 || heartrate >130 || pressure >180 || pressure<90 || temperature >103 || temperature>96 )
               { checkvalue="Critical";
            time=0;}
            else if(heartrate<50 && heartrate>60 ||heartrate>110 && heartrate<130 || pressure>160 && pressure<180 || pressure>90 && pressure<100 || temperature>101 && temperature<103 || temperature>96 && temperature<97)
                {checkvalue="Urgent";
            time=20;
                 }

            else{
                checkvalue="Non-urgent";
                time=90;}
        }
        System.out.println("Heart rate : "+heartrate);
        System.out.println("Blood pressure : "+pressure);
        System.out.println("Temperature : "+temperature);
        System.out.println("Symptom severity : "+severity);
        System.out.println("Triage priority : "+checkvalue);
        System.out.println("Estimated wait time : "+time);
        
    }
}
