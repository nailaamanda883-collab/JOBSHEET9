import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Daftar menu yang sudah tersedia di kafe
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"};

        System.out.println("=== MENU KAFE ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        System.out.print("\nMasukkan nama makanan/minuman yang ingin dicari: ");
        String cari = input.nextLine();

        boolean ditemukan = false;

        // Linear Search
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) { // equalsIgnoreCase biar gak sensitif huruf besar kecil
                ditemukan = true;
                break;
            }
        }

        System.out.println("\n=== HASIL PENCARIAN ===");
        if (ditemukan) {
            System.out.println("Menu \"" + cari + "\" tersedia di kafe ");
        } else {
            System.out.println("Maaf, menu \"" + cari + "\" tidak tersedia di kafe ");
        }

        input.close();
    }
}
