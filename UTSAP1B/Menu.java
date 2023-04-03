package UTSAP1B;
import java.util.Scanner;
class utsv1 {
    void menu() {

        Scanner input = new Scanner(System.in);
        int harga = 0;
        int harga_barang[] = {77000, 64500, 23000, 15500, 9000};
        String menu = null;
        int total;
        int umur = 0;
        double diskon;
        double bayar;
        int pembayaran;

            System.out.println("");
            System.out.println(" ____________________________________");
            System.out.println("|                                    |");
            System.out.println("|         SUPERMARKET AAJIIB         |");
            System.out.println("|____________________________________|");
            System.out.println("|     NAMA     |        HARGA        |");
            System.out.println("|______________|_____________________|");
            System.out.println("|1. Ikan Tuna  | Rp. 77.000          |");
            System.out.println("|2. Ayam       | Rp. 64.500          |");
            System.out.println("|3. Ikan Mas   | Rp. 23.000          |");
            System.out.println("|4. Susu       | Rp. 15.500          |");
            System.out.println("|5. Buah       | Rp. 9.000           |");
            System.out.println("|______________|_____________________|");
            System.out.println("");

            //Membuat input untuk user
            System.out.println("____________________________________");
            System.out.print("Masukkan Nama Anda: ");
            String nama = input.nextLine();

            System.out.print("Masukkan Umur Anda: ");
            umur = input.nextInt();

            for(String a = "Y"; a.equals("Y")||a.equals("y");) {

            System.out.println("____________________________________");
            System.out.print("Masukkan Nomor Pesanan: ");
            int input_barang = input.nextInt();

            System.out.print("Masukkan Banyak Pesanan: ");
            int jumlah = input.nextInt();
            System.out.println("____________________________________");

            if (input_barang == 1) {
                menu = "Ikan tuna";
                harga = harga + harga_barang[0] * jumlah;
                total = harga_barang[0] * jumlah;
                System.out.println("Nama Customer: " + nama + ", " + umur + " Thn");
                System.out.println("Menu Pesanan Anda: " + menu + "    x" + jumlah + "   |  Rp. " + total);
            }
            else if (input_barang == 2) {
                menu = "Ayam";
                harga = harga + harga_barang[1] * jumlah;
                total = harga_barang[1] * jumlah;
                System.out.println("Nama Customer: " + nama + ", " + umur + " Thn");
                System.out.println("Menu Pesanan Anda: " + menu + "    x" + jumlah + "   |  Rp. " + total);
            }
            else if (input_barang == 3) {
                menu = "Ikan Mas";
                harga = harga + harga_barang[2] * jumlah;
                total = harga_barang[2] * jumlah;
                System.out.println("Nama Customer: " + nama + ", " + umur + " Thn");
                System.out.println("Menu Pesanan Anda: " + menu + "    x" + jumlah + "   |  Rp. " + total);
            }
            else if (input_barang == 4) {
                menu = "Susu";
                harga = harga + harga_barang[3] * jumlah;
                total = harga_barang[3] * jumlah;
                System.out.println("Nama Customer: " + nama + ", " + umur + " Thn");
                System.out.println("Menu Pesanan Anda: " + menu + "    x" + jumlah + "   |  Rp. " + total);
            }
            else if (input_barang == 5) {
                menu = "Buah";
                harga = harga + harga_barang[4] * jumlah;
                total = harga_barang[4] * jumlah;
                System.out.println("Nama Customer: " + nama + ", " + umur + " Thn");
                System.out.println("Menu Pesanan Anda: " + menu + "    x" + jumlah + "   |  Rp. " + total);
            }
            else {
                System.out.println("Maaf Menu Yang Anda Pilih Tidak Tersedia.");
            }
                System.out.println("Apakah Anda Ingin Memesan Lagi? Y/T");
                a = input.next();
            }
                if(umur <50) {diskon = harga * 0.25;}
                else if(umur >50) {diskon = harga * 0.30;}
                else {diskon = 0;}
                
                bayar = harga-diskon;  
                System.out.println("________________________________________________");
                System.out.println("Pembayaran sebesar           :  Rp." +harga);
                System.out.println("Anda mendapat diskon sebesar :  Rp." +diskon);
                System.out.println("Total yang harus anda bayar  :  Rp." +bayar);
                System.out.println("________________________________________________");
                System.out.print  ("Jumlah uang yang diberikan   :  RP.");
        
                pembayaran = input.nextInt();
                double kembalian = pembayaran-bayar;
                
                System.out.println("Kembalian Anda Sebesar       :  Rp." +kembalian);
                System.out.println("________________________________________________");
                System.out.println("           Terimakasih atas kunjungannya.       ");
                System.out.println("________________________________________________");
                input.close();
    }
}
