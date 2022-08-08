package cinema;

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
    }
}