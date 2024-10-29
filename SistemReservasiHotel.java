import java.util.Scanner;

public class SistemReservasiHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistem Reservasi Hotel ===");

        // Input data tamu
        System.out.print("Masukkan nama tamu: ");
        String namaTamu = scanner.nextLine();
        System.out.print("Masukkan nomor telepon tamu: ");
        String nomorTelepon = scanner.nextLine();
        Tamu tamu = new Tamu(namaTamu, nomorTelepon);

        // Pilihan tipe kamar
        System.out.println("\nPilih tipe kamar:");
        System.out.println("1. Kamar Standar (Rp 500.000 per malam)");
        System.out.println("2. Kamar Suite (Rp 1.000.000 per malam + Kolam Renang Pribadi)");
        System.out.print("Masukkan pilihan tipe kamar (1 atau 2): ");
        int pilihanKamar = scanner.nextInt();

        // Memilih kamar berdasarkan input
        Kamar kamar;
        if (pilihanKamar == 1) {
            kamar = new KamarStandar("101", 500000);
        } else {
            kamar = new KamarSuite("201", 1000000, "Kolam Renang Pribadi");
        }

        // Input jumlah malam
        System.out.print("\nMasukkan jumlah malam: ");
        int jumlahMalam = scanner.nextInt();

        // Membuat objek reservasi
        Reservasi reservasi = new Reservasi(tamu, kamar, jumlahMalam);

        // Menampilkan detail reservasi
        reservasi.tampilkanReservasi();

        scanner.close();
    }
}
