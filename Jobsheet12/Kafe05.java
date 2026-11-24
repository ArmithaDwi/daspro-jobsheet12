import java.util.Scanner;

public class Kafe05 {

    public static void Menu(String namaPelanggan, boolean isMember, int jamKunjung) {

        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (jamKunjung >= 14 && jamKunjung <= 16) {
            System.out.println("Happy Hour! Diskon 20% untuk semua minuman");
        }

        System.out.println("===== MENU RESTO CAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga05(int pilihanMenu, int banyakItem) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static int hitungDiskon(int total, String kodePromo, boolean isMember) {
        int persentaseDiskon = 0;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            persentaseDiskon = 50;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            persentaseDiskon = 30;
        } else {
            System.out.println("Kode promo invalid");
        }

        if (isMember) {
            persentaseDiskon += 10;
        }

        int nominalDiskon = total * persentaseDiskon / 100;

        return nominalDiskon;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String nama = sc.nextLine();

        System.out.print("Apakah Anda member? (y/n): ");
        String status = sc.next();

        boolean member = status.equalsIgnoreCase("y");

        System.out.print("Masukkan jam kunjung: ");
        int jam = sc.nextInt();

        Menu(nama, member, jam);

        int totalBayar = 0;

        // Perulangan untuk pemesanan menu
        while (true) {

            System.out.print("Masukkan nomor menu (1-6), 0 untuk selesai: ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) {
                break;
            }

            if (pilihanMenu < 1 || pilihanMenu > 6) {
                System.out.println("Menu tidak tersedia");
                continue;
            }

            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();

            if (banyakItem <= 0) {
                System.out.println("Jumlah item harus lebih dari 0");
                continue;
            }

            int harga = hitungTotalHarga05(pilihanMenu, banyakItem);

            totalBayar += harga;

            System.out.println("Subtotal pesanan: Rp " + harga);
        }

        System.out.println("\nTotal harga: Rp " + totalBayar);

        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.next();

        int diskon = hitungDiskon(totalBayar, kodePromo, member);

        int totalAkhir = totalBayar - diskon;

        System.out.println("\n===== RINCIAN PEMBAYARAN =====");
        System.out.println("Nama pelanggan : " + nama);
        System.out.println("Status member  : " + (member ? "Member" : "Non-Member"));

        if (member) {
            System.out.println("Diskon member  : 10%");
        }

        System.out.println("Kode promo     : " + kodePromo);
        System.out.println("Total harga    : Rp " + totalBayar);
        System.out.println("Besar diskon   : Rp " + diskon);
        System.out.println("Total bayar    : Rp " + totalAkhir);
        System.out.println("==============================");

        sc.close();
    }
}
