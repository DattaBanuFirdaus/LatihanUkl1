import java.util.Scanner;

public class soalUkl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Berat Paket (kg): ");
        double berat = input.nextDouble();

        System.out.println("Masukkan Jarak Tempuh (km): ");
        double jarak = input.nextDouble();

        System.out.println("Masukkan Panjang Paket (cm): ");
        double panjang = input.nextDouble();

        System.out.println("Masukkan Lebar Paket (cm): ");
        double lebar = input.nextDouble();

        System.out.println("Masukkan Tinggi Paket (cm): ");
        double tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi;

        double tarifPerKg;
        if (jarak <= 10) {
            tarifPerKg = 4250;
        } else {
            tarifPerKg = 6000;
        }

        double biayaBerat = berat * tarifPerKg;

        double biayatotal;
        if (volume > 100) {
            biayatotal = biayaBerat + 50000;
        } else {
            biayatotal = biayaBerat;
        }
       
        System.out.println("Volume Paket: " + volume + " cm3");
        System.out.println("Biaya berdasarkan Berat: Rp " + biayaBerat);
        System.out.println("Biaya Total: Rp " + biayatotal);

    }
}
