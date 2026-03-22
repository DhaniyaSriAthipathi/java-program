import java.util.Scanner;

public class Nested16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int occupiedSpots = sc.nextInt();
        int[] rPos = new int[occupiedSpots];
        int[] cPos = new int[occupiedSpots];
        for (int i = 0; i < occupiedSpots; i++) {
            rPos[i] = sc.nextInt();
            cPos[i] = sc.nextInt();
        }
        System.out.println("Parking Lot Grid:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                boolean isOccupied = false;
                for (int k = 0; k < occupiedSpots; k++) {
                    if (rPos[k] == i && cPos[k] == j) {
                        isOccupied = true;
                        break;
                    }
                }
                if (isOccupied) {
                    System.out.print("[O] ");
                } else {
                    System.out.print("[ ] ");
                }
            }
            System.out.println();
        }
        int total = rows * cols;
        int occupied = occupiedSpots;
        int vacant = total - occupied;
        double rate = (occupied * 100.0) / total;
        System.out.println();
        System.out.println("Total Spots: " + total);
        System.out.println("Occupied: " + occupied);
        System.out.println("Vacant: " + vacant);
        System.out.printf("Occupancy Rate: %.2f%%\n", rate);
    }
}