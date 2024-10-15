import java.util.Scanner;
public class bioskop09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tiket = 0, totalTiket = 0;
        double hargaTiket = 50000, hbsDiskon = 0, totalHarga = 0, diskon = 0, totalPenjualan = 0;

        System.out.println("=============== WELCOME IN MOPIC MALANG RAYA ===============");
        
        int i = 1;
        while (true) {
            System.out.println("Masukkan jumlah tiket yang akan anda beli / (0 untuk batal): ");
            tiket = sc.nextInt();

            if (tiket <=0 ) {
                System.out.println("Program dibatalkan");
                break;
            }

            totalHarga = tiket * hargaTiket;
            
            if (tiket > 10) {
                diskon = 0.15 * totalHarga;
            } else if (tiket > 4 && tiket <= 10) {
                diskon = 0.10 * totalHarga;
            }

            hbsDiskon = totalHarga - diskon;

            totalTiket += tiket;
            totalPenjualan += hbsDiskon;


            System.out.println("Harga asli: " + totalHarga);
            System.out.println("Total harga setelah diskon: " + hbsDiskon);
            System.out.println("Tiket berhasil dibeli!!");
        }
            System.out.println("========= REKAP PENJUALAN HARIAN =========");
            System.out.println("Total tiket terjual untuk hari ini: " + totalTiket);
            System.out.println("Total penjualan hari ini: " + totalPenjualan);


        sc.close();
    }
}
