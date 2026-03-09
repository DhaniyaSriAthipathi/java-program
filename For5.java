import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int occupancy=0;
        String based=" ";
        int average=0;
        for(int i=0;i<n;i++)
        {
            int day=sc.nextInt();
        int roomOccupied=sc.nextInt();
        int totalRoom=sc.nextInt();
            occupancy=(roomOccupied*100/totalRoom);
            if(occupancy<60)
            {
                based="Low";
            }
            else if(occupancy>=60 && occupancy<=79)
            {
                based="Moderate";
            }
            else if(occupancy>=80 && occupancy<=99)
            {
                based="High";
            }
            else if(occupancy>100)
            {
                based="Full";
            }
            average=totalRoom/occupancy;
            System.out.println("Days : "+day);
            System.out.println("Room occupied : "+roomOccupied);
            System.out.println("Occupancy Rate : "+occupancy);
            System.out.println("Status : "+based);
            System.err.println("Total days analyzed : "+n);
            System.out.println("Average occupancy rate : "+average);
        }
        
    }
}
