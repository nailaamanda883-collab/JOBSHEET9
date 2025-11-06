import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah;
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlah = input.nextInt();
        
        int[] nilai = new int[jumlah];
        int total = 0;
        
        // Input nilai mahasiswa
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }
        
        // Hitung rata-rata
        double rataRata = (double) total / jumlah;
        
        // Cari nilai tertinggi dan terendah
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        
        for (int i = 1; i < jumlah; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }
        
        // Tampilkan hasil
        System.out.println("\n=== HASIL DATA NILAI MAHASISWA ===");
        System.out.println("Semua nilai: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nilai ke-" + (i+1) + ": " + nilai[i]);
        }
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        
        input.close();
    }
}