import java.util.Scanner;

public class Conditional14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String membership=sc.nextLine();
        int contract=sc.nextInt();
        String accessLevel=sc.nextLine();
        sc.nextLine();
        String addons=sc.nextLine();
        int base=0;
        int discount=0;
        int access=0;
        int fee=0;
        if(membership.equals("Basic"))
        {
            base=40;
        }
        else if(membership.equals("Premium"))
        {
            base=80;
        }
        else if(membership.equals("VIP"))
        {
            base=150;
        }
        if(contract==1)
        {
            discount=0;
        }
        else if(contract==6)
        {
            discount=10;
        }
        else if(contract==12)
        {
            discount=15;
        }
        else if(contract==24)
        {
            discount=25;
        }
        if(accessLevel.equals("Single-location"))
        {
            access=0;
        }
        else if(accessLevel.equals("Nationwide"))
        {
            access=50;
        }
        else if(accessLevel.equals("Regional"))
        {
            access=20;
        }
        if(addons.equals("None"))
        {
            fee=0;
        }
        else if(addons.equals("Personal-Training"))
        {
            fee=100;
        }
        else if(addons.equals("Classes"))
        {
            fee=50;
        }
        else if(addons.equals("Full-packages : "))
        {
            fee=200;
        }
        int discountbase=base+(1-discount/100);
        int monthlytotal=discountbase+access+fee;
        int contracttotal=monthlytotal*discount;
        int saving=(base+access+fee)+discount-contracttotal;
        System.out.println("Membership : "+membership);
        System.err.println("Contract length : "+contract);
        System.out.println("Access level : "+accessLevel);
        System.out.println("Adds-on : "+addons);
        System.out.println("Base monthly : "+base);
        System.out.println("Contract discount : "+discount);
        System.out.println("Access fee : "+access);
        System.out.println("Adds-on fee : "+fee);
        System.out.println("Monthly total : "+monthlytotal);
        System.out.println("Saving vs month-to-month : "+saving);

    }
}
