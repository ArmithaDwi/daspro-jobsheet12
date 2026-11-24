public class PengunjungCafe05 {

    public static void daftarPengunjung(int nomorMeja, String... namaPengunjung) {
        System.out.println("Nomor Meja: " + nomorMeja);
        System.out.println("Daftar Nama Pengunjung:");

        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    public static int hitungTotalBelanja(int... harga) {
        int total = 0;

        for (int nilai : harga) {
            total += nilai;
        }

        return total;
    }

    public static void main(String[] args) {
        daftarPengunjung(5, "Ali", "Budi", "Citra");

        System.out.println("Total 1 harga: Rp " + hitungTotalBelanja(10000));
        System.out.println("Total 3 harga: Rp " + hitungTotalBelanja(10000, 15000, 20000));
        System.out.println("Total 5 harga: Rp " + hitungTotalBelanja(10000, 15000, 20000, 25000, 30000));
    }
}
