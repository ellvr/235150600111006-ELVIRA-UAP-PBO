public abstract class Tanaman {
    protected int masaHidup;
    protected int lamaHidup;
    protected int berbuah;
    protected int buah;
    protected double perkembangan;
    protected double prosesBerbuah;

    public abstract void berkembang();

    public String status() {
        return "Masa Hidup: " + masaHidup + ", Lama Hidup: " + lamaHidup + ", Berbuah: " + berbuah + 
               ", Buah: " + buah + ", Perkembangan: " + perkembangan + ", Proses Berbuah: " + prosesBerbuah;
    }

    @Override
    public String toString() {
        return  "Masa Hidup=" + masaHidup +
                "/nLama Hidup=" + lamaHidup +
                "/nBerbuah=" + berbuah +
                "/nBuah=" + buah +
                "/nPerkembangan=" + perkembangan +
                "/nProses Berbuah=" + prosesBerbuah;
    }

    public int getMasaHidup() {
        return masaHidup;
    }

    public void setMasaHidup(int masaHidup) {
        this.masaHidup = masaHidup;
    }

    public int getLamaHidup() {
        return lamaHidup;
    }

    public void setLamaHidup(int lamaHidup) {
        this.lamaHidup = lamaHidup;
    }

    public int getBerbuah() {
        return berbuah;
    }

    public void setBerbuah(int berbuah) {
        this.berbuah = berbuah;
    }

    public int getBuah() {
        return buah;
    }

    public void setBuah(int buah) {
        this.buah = buah;
    }

    public double getPerkembangan() {
        return perkembangan;
    }

    public void setPerkembangan(double perkembangan) {
        this.perkembangan = perkembangan;
    }

    public double getProsesBerbuah() {
        return prosesBerbuah;
    }

    public void setProsesBerbuah(double prosesBerbuah) {
        this.prosesBerbuah = prosesBerbuah;
    }
}