import java.util.Scanner;

public class HitungBalok05 {

    public static int hitungLuas(int pjg, int lb){
        int Luas = pjg * lb;
        return Luas;
    }

    public static int hitungVolume(int tinggi, int a, int b){
        int volume = hitungLuas(a, b) * tinggi;;
        return volume;
    }

    public class LacakFungsi {
        static int kali2(int x) {
            return x * 2;
        }

        static int tambah(int a, int b) {
            return a + b;
        }

        static void cetak(int n) {
            for (int i = n; i > 0; i -= 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int a = kali2(3);
            int b = tambah(a, kali2(1));
            cetak(b);
            cetak(tambah(b, -a) + 1);
        }
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        int p, l, t, L, vol;

        System.out.println("Masukkan panjang:");
        p = input.nextInt();
        System.out.println("Masukkan lebar:");
        l = input.nextInt();
        System.out.println("Masukkan tinggi:");
        t = input.nextInt();

        L = p * l;

        System.out.println("Luas persegi panjang adalah " + L);
        vol = p * l * t;

        System.out.println("Volume balok adalah " + vol);

        input.close();

    }
    
}
