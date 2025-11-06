import java.util.Scanner;

public class SearchNilai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai yang diinput: ");
        int jumlah = sc.nextInt();

        int[] nilai = new int[jumlah];

        // Input nilai array
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.print("\nMasukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        boolean ditemukan = false;

        // Proses pencarian
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                ditemukan = true;
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                break; 
            }
        }

        if (!ditemukan) {
            System.out.println("Nilai yang dicari tidak ditemukan.");
        }

        sc.close();
    }
}
