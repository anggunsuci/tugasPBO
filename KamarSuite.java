public class KamarSuite extends Kamar {
    private String fasilitasTambahan;

    public KamarSuite(String nomorKamar, double hargaPerMalam, String fasilitasTambahan) {
        super(nomorKamar, hargaPerMalam);
        this.fasilitasTambahan = fasilitasTambahan;
    }

    public String getFasilitasTambahan() { return fasilitasTambahan; }

    @Override
    public String getTipeKamar() {
        return "Kamar Suite";
    }

    @Override
    public void tampilkanInfoKamar() {
        super.tampilkanInfoKamar();
        System.out.println("Fasilitas Tambahan: " + fasilitasTambahan);
    }
}
