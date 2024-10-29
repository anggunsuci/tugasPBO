public class KamarStandar extends Kamar {
    public KamarStandar(String nomorKamar, double hargaPerMalam) {
        super(nomorKamar, hargaPerMalam);
    }

    @Override
    public String getTipeKamar() {
        return "Kamar Standar";
    }
}
