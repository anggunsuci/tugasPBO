abstract class Kamar {
    private String nomorKamar;
    private double hargaPerMalam;

    public Kamar(String nomorKamar, double hargaPerMalam) {
        this.nomorKamar = nomorKamar;
        this.hargaPerMalam = hargaPerMalam;
    }

    public String getNomorKamar() { return nomorKamar; }
    public double getHargaPerMalam() { return hargaPerMalam; }

    public abstract String getTipeKamar();

    public void tampilkanInfoKamar() {
        System.out.println("Nomor Kamar: " + nomorKamar);
        System.out.println("Tipe Kamar: " + getTipeKamar());
        System.out.println("Harga per Malam: Rp " + hargaPerMalam);
    }
}
