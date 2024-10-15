import java.util.Scanner;
public class biayaparkir09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int durasi = 0, total = 0, harga = 0, jenis;

        System.out.println("=============== WELCOME IN SYSTEM PARKING ===============");

        int i = 1;
        
        while (true) {
        System.out.println("Masukkan Jenis kendaraan (0.Keluar 1.Mobil 2.Motor): ");
        jenis = sc.nextInt();
        System.out.println("Berapa durasi anda parkir (jam): ");
        durasi = sc.nextInt();

        if (jenis == 0) {
            System.out.println("Program dibatalkan, user diarahkan keluar");
            break;
        }

        if (durasi > 5) {
            harga = 12500;
        } else {
            if (jenis == 1) {
                harga = durasi * 3000;
            } else if (jenis == 2) {
                harga = durasi * 2000;
            } else {
                System.out.println("Jenis kendaraan tidak valid");
                continue;
            }
        }
        total = harga;
        
        System.out.println("Total harga yang harus anda bayar adalah: " + total);
        } 

        System.out.println("============= THANK YOU =============");

    }
}
