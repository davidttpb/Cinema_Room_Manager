package cinema;
import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        System.out.print("Cinema:\n");
        System.out.print("  ");
        int seats = 9;
        for (int j = 1; j < seats; j++) {
            System.out.print(j + " ");
        }
        System.out.println("");

        int rows = 8;
        String s = " S S S S S S S S";
        for (int i = 1; i < rows; i++) {
            System.out.println(i + s);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int numRows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int numSeats = scanner.nextInt();

        if (numRows >= 1 && numRows <= 9 && numSeats >= 1 && numSeats <= 9) {
            int totalSeats = numRows * numSeats;
            if (totalSeats <= 60) {
                int profitOfSmallRoom = totalSeats * 10;
                System.out.println("Total income:");
                System.out.print("$" + profitOfSmallRoom);
            } else if (totalSeats > 60 && numRows % 2 == 0) {
                int frontRow = numRows / 2;
                int backRow = numRows / 2;
                int totalIncome = frontRow * numSeats * 10 + backRow * numSeats * 8;
                System.out.println("Total income:");
                System.out.println("$" + totalIncome);
            } else if (numRows % 2 == 1) {
                int frontRow = numRows / 2;
                int backRow = (numRows / 2) + 1;
                int totalIncome = frontRow * numSeats * 10 + backRow * numSeats * 8;
                System.out.println("Total income:");
                System.out.println("$" + totalIncome);
            }
        }
    }
}