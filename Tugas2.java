import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = input.nextInt();
        input.nextLine(); // biar enter sebelumnya gak kebaca

        String[] namaPesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];
        int total = 0;

        // Input nama dan harga tiap pesanan
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            System.out.print("Masukkan nama makanan/minuman: ");
            namaPesanan[i] = input.nextLine();
            System.out.print("Masukkan harga: ");
            hargaPesanan[i] = input.nextInt();
            input.nextLine(); // bersihkan buffer
            total += hargaPesanan[i];
        }

        // Output daftar pesanan dan total biaya
        System.out.println("\n=== DAFTAR PESANAN KAFE ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " -> Rp " + hargaPesanan[i]);
        }
        System.out.println("-----------------------------------");
        System.out.println("Total biaya semua pesanan: Rp " + total);

        input.close();
    }
}
