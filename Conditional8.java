import java.util.Scanner;

public class Conditional8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String tier=sc.nextLine();
        int square=sc.nextInt();
        int age=sc.nextInt();
        int amenity=sc.nextInt();
        int amt=0;
        int adjustment=0;
        int score=0;
        String value="Hot";
        if(tier.equals("Prime"))
        {
            amt=400;
            if(age<15)
                value ="Hot";
        }
        else if(tier.equals("Urban"))
        {
            amt=300;
            if(age <15)
                value="Hot";
        }
        else if(tier.equals("suburban"))
        {
            amt=180;
            value="Stable";
        }
        else if(tier.equals("Rural"))
        {
            amt=100;
            if(age>30)
                value="Slow";
        }
        if(age>0 && age<=5)
        {
            adjustment=0;
        }
        else if(age >=6 && age<=15)
        {
            adjustment=10;
        }
        else if(age>=16 && age <=30 )
        {
            adjustment=20;
        }
        else if(age>=31)
        {
            adjustment=35;
        }
        if(amenity>=80 && amenity<=100)
            score=10;
        else if(amenity>=60 && amenity<=79)
            score=5;
        else if(amenity>=40 && amenity<=59)
            score=2;
        else if(amenity<40)
            score=0;
        int basevalue=(square*amt);
        int adjustedvalue=basevalue*(1+age/100);
        int finalvalue=adjustedvalue+amenity;

        System.out.println("Location tier : "+tier);
        System.out.println("Square footage : "+square);
        System.out.println("Property age : "+age);
        System.out.println("Amenity score : "+amenity);
        System.out.println("Base price : "+amt);
        System.out.println("Age adjustment : "+adjustment);
        System.out.println("Amenity bonus : "+basevalue);
        System.out.println("Estimted value : "+finalvalue);
        System.out.println("Market category : "+value);

    }
}
