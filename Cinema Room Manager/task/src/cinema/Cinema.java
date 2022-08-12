package cinema;

import java.util.Scanner;

public class Cinema{
    static int rowNum;
    static int seatNum;
    static char[][] cinemaHall;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        cinemaHall = new char[rows+1][seats+1];

        System.out.println("Cinema:");
        char count = '1';

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= seats; j++) {
                if(cinemaHall[i][j]!='B'){
                    cinemaHall[i][j] = 'S';
                }
            }
        }

        for (int i = 0; i < 1; i++) {
            for (int j = 1; j <= seats; j++) {
                cinemaHall[0][j] = count;
                count++;
            }
            count = '1';
        }
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < 1; j++) {
                cinemaHall[i][j] = count;
                count++;
            }
        }


        char b = 'B';
        cinemaHall[rowNum][seatNum] = b;
        cinemaHall[0][0] = ' ';
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= seats; j++) {
                System.out.print(cinemaHall[i][j] + " ");
            } System.out.println();
        }

        System.out.println("Enter a row number:");
        int rowNum1 = scanner.nextInt();
        rowNum = rowNum1;
        System.out.println("Enter a seat number in that row:");
        int seatNum1 = scanner.nextInt();
        seatNum = seatNum1;

        int first = rows / 2;
        int ticketPrice = 0;

        if (rows * seats < 60) {
            ticketPrice = 10;
        } else if (rowNum <= first) {
            ticketPrice = 10;
        } else {
            ticketPrice = 8;
        }

        System.out.println("Cinema:");
        char count2 = '1';

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= seats; j++) {
                if(cinemaHall[i][j]!='B'){
                    cinemaHall[i][j] = 'S';
                }
            }
        }

        for (int i = 0; i < 1; i++) {
            for (int j = 1; j <= seats; j++) {
                cinemaHall[0][j] = count2;
                count2++;
            }
            count2 = '1';
        }
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < 1; j++) {
                cinemaHall[i][j] = count2;
                count2++;

            }
        }

        char b2 = 'B';
        cinemaHall[rowNum][seatNum] = b2;
        cinemaHall[0][0] = ' ';
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= seats; j++) {
                System.out.print(cinemaHall[i][j] + " ");
            } System.out.println();
        }
        System.out.println("Ticket price: $" + ticketPrice);
        System.out.println();
    }
}