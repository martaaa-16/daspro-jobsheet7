import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahTiket, hargaTiket = 50000, totalTiket = 0, tiketTerjual = 0;
        double totalHarga = 0;

        do {
            System.out.print("Jumlah pembelian tiket (ketik '0' untuk pembatalan): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                System.out.println("Dibatalkan.");
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Data tidak valid.");
                continue;
            }

            totalHarga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                totalHarga = totalHarga * 0.85;
            } else if (jumlahTiket > 4) {
                totalHarga = totalHarga * 0.9;
            }

            System.out.println("Total harga untuk " + jumlahTiket + " tiket yang harus dibayarkan " + totalHarga);

            totalTiket += jumlahTiket;
            tiketTerjual += totalHarga;

        } while (true);
        System.out.print("Hasil yang terjual: ");
        System.out.println("Jumlah tiket yang terjual: " + totalTiket);
        System.out.println("Total pendapatan: Rp " + tiketTerjual);
    }
}
