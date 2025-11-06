import java.util.Scanner;

public class ArrayRataNilai19 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Mahasiswa: ");
         int jumlah = input.nextInt();
        int[] nilaiMhs = new int[jumlah];
        double totalLulus = 0, totalTidakLulus = 0;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input.nextInt();

            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }
        double rataLulus = (jumlahLulus > 0) ? (totalLulus / jumlahLulus) : 0;
        double rataTidakLulus = (jumlahTidakLulus > 0) ? (totalTidakLulus / jumlahTidakLulus) : 0;

        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);



    }
}
