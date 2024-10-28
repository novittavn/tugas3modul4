import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Kelas Siswa merepresentasikan data seorang siswa dengan nama dan nilai.
 */
class Siswa {
    private String nama;
    private double nilai;

    /**
     * Konstruktor untuk membuat objek Siswa.
     *
     * @param nama  Nama siswa.
     * @param nilai Nilai siswa.
     */
    public Siswa(String nama, double nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    /**
     * Mengambil nama siswa.
     *
     * @return Nama siswa.
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengambil nilai siswa.
     *
     * @return Nilai siswa.
     */
    public double getNilai() {
        return nilai;
    }
}

/**
 * Kelas PengelolaNilai bertanggung jawab untuk mengelola data nilai siswa,
 * menghitung rata-rata nilai, dan menentukan kategori nilai.
 */
class PengelolaNilai {
    private List<Siswa> siswaList;

    /**
     * Konstruktor untuk membuat objek PengelolaNilai.
     */
    public PengelolaNilai() {
        siswaList = new ArrayList<>();
    }

    /**
     * Menambahkan data siswa baru ke dalam daftar.
     *
     * @param nama  Nama siswa.
     * @param nilai Nilai siswa.
     */
    public void tambahSiswa(String nama, double nilai) {
        siswaList.add(new Siswa(nama, nilai));
    }

    /**
     * Menghitung rata-rata nilai dari seluruh siswa yang ada dalam daftar.
     *
     * @return Rata-rata nilai siswa. Mengembalikan 0 jika tidak ada siswa.
     */
    public double hitungRataRata() {
        double total = 0;
        for (Siswa siswa : siswaList) {
            total += siswa.getNilai();
        }
        return siswaList.size() > 0 ? total / siswaList.size() : 0;
    }

    /**
     * Menentukan kategori berdasarkan rata-rata nilai yang diberikan.
     *
     * @param rataRata Rata-rata nilai yang akan dikategorikan.
     * @return Kategori nilai berdasarkan rata-rata.
     */
    public String tentukanKategoriNilai(double rataRata) {
        if (rataRata >= 90) {
            return "Sangat Baik";
        } else if (rataRata >= 80) {
            return "Baik";
        } else if (rataRata >= 70) {
            return "Cukup";
        } else if (rataRata >= 60) {
            return "Kurang";
        } else {
            return "Sangat Kurang";
        }
    }

    /**
     * Menampilkan daftar seluruh siswa beserta nilainya.
     */
    public void tampilkanSiswa() {
        System.out.println("Daftar Siswa:");
        for (Siswa siswa : siswaList) {
            System.out.printf("Nama: %s, Nilai: %.2f\n", siswa.getNama(), siswa.getNilai());
        }
    }
}

/**
 * Kelas utama PenghitunganNilaiSiswa berfungsi untuk menjalankan program
 * dan berinteraksi dengan pengguna untuk memasukkan data siswa.
 */
public class Main {
    /**
     * Metode utama yang menjalankan program.
     *
     * @param args Argumen baris perintah (tidak digunakan).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PengelolaNilai pengelola = new PengelolaNilai();

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nama siswa ke-" + (i + 1) + ": ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
            double nilai = scanner.nextDouble();
            scanner.nextLine(); // Membersihkan newline
            pengelola.tambahSiswa(nama, nilai);
        }

        pengelola.tampilkanSiswa();

        double rataRata = pengelola.hitungRataRata();
        System.out.printf("Rata-rata nilai siswa: %.2f\n", rataRata);

        System.out.println("Kategori nilai: " + pengelola.tentukanKategoriNilai(rataRata));

        scanner.close();
    }
}
