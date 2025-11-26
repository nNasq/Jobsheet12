import java.util.Scanner;

public class NilaiMahasiswa10 {

    public static void isianArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static void tampilArray(int[] arr) {
        System.out.println("\nDaftar nilai mahasiswa:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + arr[i]);
        }
    }

    public static int hitTot(int[] arr) {
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = sc.nextInt();

        int[] nilaiMhs = new int[N];
        isianArray(nilaiMhs);
        tampilArray(nilaiMhs);

        int totalNilai = hitTot(nilaiMhs);
        System.out.println("\nTotal nilai seluruh mahasiswa: " + totalNilai);
    }
}
