public class Tomat extends Tanaman implements Perawatan {

    public Tomat() {
        masaHidup = 100;
        berbuah = 100;
        perkembangan = 0.25;
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
        perkembangan += 0.05;
    }

    @Override
    public String toString() {
        return "Tomat: " + super.toString();
    }
}