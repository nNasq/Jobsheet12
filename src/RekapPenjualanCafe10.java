import java.util.Scanner;

public class RekapPenjualanCafe10 {
    Scanner sc = new Scanner(System.in);

    String[] menu;
    int[][] penjualan;
    int jumlahMenu, jumlahHari;

    public static void main(String[] args) {
        RekapPenjualanCafe10 app = new RekapPenjualanCafe10();

        app.inputUkuran();
        app.inputData();
        app.tampilkanTabel();
        app.tampilkanMenuTertinggi();
        app.tampilkanRataRata();
    }

    void inputUkuran() {
        System.out.print("Masukkan jumlah menu: ");
        jumlahMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari penjualan: ");
        jumlahHari = sc.nextInt();

        menu = new String[jumlahMenu];
        penjualan = new int[jumlahMenu][jumlahHari];
    }

    void inputData() {
        sc.nextLine();
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();

            System.out.println("Input penjualan untuk menu " + menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
    }

    void tampilkanTabel() {
        System.out.println("\n=== Tabel Penjualan ===");
        System.out.printf("%-15s", "Menu");

        for (int h = 1; h <= jumlahHari; h++) {
            System.out.printf("\tHari %d ", h);
        }
        System.out.println();

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.printf("%-15s", menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.printf("%7d ", penjualan[i][j]);
            }
            System.out.println();
        }
    }

    void tampilkanMenuTertinggi() {
        int maxTotal = -1;
        String menuTertinggi = "";

        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                menuTertinggi = menu[i];
            }
        }

        System.out.println("\nMenu dengan total penjualan tertinggi: " + menuTertinggi);
        System.out.println("Total: " + maxTotal);
    }

    void tampilkanRataRata() {
        System.out.println("\n=== Rata-rata Penjualan ===");
        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }
            double rata = (double) total / jumlahHari;
            System.out.printf("%-15s : %.2f\n", menu[i], rata);
        }
    }
}
