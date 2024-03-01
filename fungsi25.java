import java.util.Scanner;

public class fungsi25 {
    static Scanner sc = new Scanner(System.in);
    static String[] bunga = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
    static int[] harga = { 75_000, 50_000, 60_000, 10_000 };
    static int[] pendapatan = new int[bunga.length];
    static int[] kurang = {1, 2, 0, 5};

    static int[][] stock = { { 10, 6, 2, 5 }, { 5, 11, 10, 7 }, { 15, 9, 10, 12 }, { 7, 12, 5, 9 } };

    public static void main(String[] args) {
        int pilih;

        for (int i = 0; i < bunga.length; i++) {
            stock[i][3] -= kurang[i]; 
        }

        System.out.println("Aplikasi RoyalGarden");
        System.out.println("1. Prediksi Pendapatan");
        System.out.println("2. Cek Stok");
        System.out.println("-->");
        pilih = sc.nextInt();

        switch (pilih) {
            case 1:
                pendapatan();
                break;
        
            case 2:
                stok();
                break;

            default:
                break;
        }

    }

    static void pendapatan() {
        for (int i = 0; i < pendapatan.length; i++) {
            for (int j = 0; j < bunga.length; j++) {
                pendapatan[i] +=  stock[j][i] * harga[j];
            }
        }
        System.out.printf("%-20s | %-15s | %-15s | %-15s | %-15s | %-15s%n", " ", "Aglonema", "Keladi",
                "Alocasia", "Mawar", "Total Pendapatan");

        for (int i = 0; i < bunga.length; i++) {
            System.out.printf("%-20s | %-15s | %-15s | %-15s | %-15s | %-15s%n", "RoyalGarden " + (i + 1), stock[0][i],
                    stock[1][i], stock[2][i], stock[3][i], "Rp. "+pendapatan[i]);
        }
    }

    static void stok() {
        System.out.printf("%-20s | %-15s | %-15s | %-15s | %-15s%n", " ", "Aglonema", "Keladi",
                "Alocasia", "Mawar");
        for (int i = 0; i < bunga.length; i++) {
            System.out.printf("%-20s | %-15s | %-15s | %-15s | %-15s%n", bunga[i], stock[0][i],
                    stock[1][i], stock[2][i], stock[3][i]);
        }
        System.out.println("+-----------------------------------------+");
        System.out.println("Mesagge");
        System.out.println("RoyalGarden 4");
        System.out.println("Bunga mati: ");
        for (int i = 0; i < bunga.length; i++) {
            System.out.println(bunga[i] + "-" +kurang[i]);
        }
    }
}
