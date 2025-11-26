import java.util.Scanner;

public class Kafe10 {

    public static void main(String[] args) {
        Menu("Andi", true, "DISKON50");

        Scanner sc = new Scanner(System.in);
        String kodePromo = "DISKON50";

        int totalKeseluruhan = 0;
        char ulang;

        do {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            int totalBayar = hitungTotalHarga10(pilihanMenu, banyakItem, kodePromo);
            System.out.println("Subtotal pesanan: Rp " + totalBayar);

            totalKeseluruhan += totalBayar;

            System.out.print("Apakah ingin memesan menu lain? (y/n): ");
            ulang = sc.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("\n=== TOTAL KESELURUHAN ===");
        System.out.println("Total semua pesanan: Rp " + totalKeseluruhan);
    }

    public static int hitungTotalHarga10(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        int hargaDiskon = hargaTotal;

        if (kodePromo.equals("DISKON50")) {
            hargaDiskon = hargaTotal / 2;
            System.out.println("Diskon 50% diterapkan!");
        } else if (kodePromo.equals("DISKON30")) {
            hargaDiskon = hargaTotal - (hargaTotal * 30 / 100);
            System.out.println("Diskon 30% diterapkan!");
        } else {
            System.out.println("Kode promo invalid.");
        }

        return hargaDiskon;
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember)
            System.out.println("Anda adalah member Kafe10. Nikmati diskon spesial!\n");

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid: Diskon 50%.\n");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid: Diskon 30%.\n");
        } else {
            System.out.println("Kode promo invalid.\n");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp. 15,000");
        System.out.println("2. Cappuccino - Rp. 20,000");
        System.out.println("3. Latte - Rp. 22,000");
        System.out.println("4. Teh Tarik - Rp. 12,000");
        System.out.println("5. Roti Bakar - Rp. 10,000");
        System.out.println("6. Mie Goreng - Rp. 18,000");
        System.out.println("============================");
    }
}
