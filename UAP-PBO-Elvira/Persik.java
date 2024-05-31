public class Persik extends Tanaman implements Perawatan {

    public Persik() {
        masaHidup = 180;
        berbuah = 250;
        perkembangan = 0.15;
    }

    @Override
    public void berkembang() {
        if (status().equals("Hidup")) {
            lamaHidup++;
            prosesBerbuah += perkembangan * 100;
            if (prosesBerbuah >= berbuah) {
                buah++;
                prosesBerbuah -= berbuah;
            }
        }
    }

    @Override
    public void treatment() {
        perkembangan += 0.025;
    }

    @Override
    public String toString() {
        return "Persik: " + super.toString();
    }
}
