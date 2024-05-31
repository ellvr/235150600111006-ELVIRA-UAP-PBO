class Stroberi extends Tanaman implements Perawatan {

    public Stroberi() {
        masaHidup = 60;
        berbuah = 150;
        perkembangan = 0.35;
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
        return "Stroberi: " + super.toString();
    }
}