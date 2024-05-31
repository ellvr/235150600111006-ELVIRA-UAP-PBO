import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    public static ArrayList<String> tanamans = new ArrayList<String>();
    public static ArrayList<Integer> lokasi = new ArrayList<Integer>(); 
    public static Scanner in = new Scanner(System.in);

    public void mulai() {
        Scanner scanner = new Scanner(System.in);

        // Input masa tanam
        System.out.print("Masukkan masa tanam: ");
        int masaTanamBulan = scanner.nextInt();
        int masaTanamHari = masaTanamBulan * 30;

        // Menanam 3 tanaman di awal
        for (int i = 0; i < 3; i++) {
            menanam();
        }

        for (int hari = 1; hari <= masaTanamHari; hari++) {
            if (hari % 90 == 0) {
                for (int i = 0; i < tanamans.size(); i++) {
                    if (!lokasi.contains(i) && tanamans.get(i).status().equals("Hidup")) {
                         ((Perawatan) tanamans.get(i)).treatment();
                    }
                }
            }

            for (int i = 0; i < tanamans.size(); i++) {
                if (lokasi.contains(i)) {
                    continue;
                }

                if (tanamans.get(i).status().equals("Hidup")) {
                    tanamans.get(i).berkembang();
                } else {
                    lokasi.add(i);
                    menanam();
                }
            }
        }
    }

    public void menanam() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("mau nanam apa?");
        System.out.println("1. Tomat");
        System.out.println("2. Stoberi");
        System.out.println("3. Persik");
        int pilihan = scanner.nextInt();

        Tanaman tanamanBaru;
        switch (pilihan) {
            case 1:
                tanamanBaru = new Tomat();
                break;
            case 2:
                tanamanBaru = new Stroberi();
                break;
            case 3:
                tanamanBaru = new Persik();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                tanamanBaru = new Tomat();
                break;
        }
        tanamans.add(tanamanBaru);
        System.out.println("Berhasil menanam.");
    }

    public void info() {
        for (int i = 0; i < tanamans.size(); i++) {
            System.out.println("Tanaman buah ke-" + (i + 1) + ": " + tanamans.get(i));
        }
    }
}
