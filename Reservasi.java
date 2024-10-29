public class Reservasi {
    private Tamu tamu;
    private Kamar kamar;
    private int jumlahMalam;

    public Reservasi(Tamu tamu, Kamar kamar, int jumlahMalam) {
        this.tamu = tamu;
        this.kamar = kamar;
        this.jumlahMalam = jumlahMalam;
    }

    public double hitungTotalBiaya() {
        return kamar.getHargaPerMalam() * jumlahMalam;
    }

    public void tampilkanReservasi() {
        System.out.println("\nDetail Reservasi:");
        System.out.println("Nama Tamu: " + tamu.getNama());
        System.out.println("Nomor Kamar: " + kamar.getNomorKamar());
        System.out.println("Tipe Kamar: " + kamar.getTipeKamar());
        System.out.println("Jumlah Malam: " + jumlahMalam);
        System.out.println("Total Biaya: Rp " + hitungTotalBiaya());
        kamar.tampilkanInfoKamar();
    }
}
