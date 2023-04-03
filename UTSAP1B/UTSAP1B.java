package UTSAP1B;

import java.util.Scanner;
public class UTSAP1B {
    public static void main(String[] args) { //IKHWAN FADHILAH_51421603
        Scanner input = new Scanner(System.in);
        
        int harga = 0;
        int harga_item[] = {20000, 35000, 59000, 63000, 18000, 12000, 5000, 2000};
        String menu = null;
        int total;
        int umur = 0;
        double diskon;
        double bayar;
        int pembayaran;
       
        for (String a = "Y"; a.equals("Y")||a.equals("y"); )
        {
        System.out.println("");
        System.out.println("_________________________________________________");
        System.out.println("|                       MENU                    |");
        System.out.println("|_______________________________________________|");
        System.out.println("|          Nama               |     Harga       |");
        System.out.println("|_____________________________|_________________|");
        System.out.println("| 1. Javabica                 |   Rp 20000      |");
        System.out.println("| 2. Espresso                 |   Rp 35000      |");
        System.out.println("| 3. Caramel Chocolate Grande |   Rp 59000      |");
        System.out.println("| 4. Mocha Praline cream      |   Rp 63000      |");
        System.out.println("| 5. Mocha Latte without art  |   Rp 12000      |");
        System.out.println("| 6. Mocha Latte with Art     |   Rp 18000      |");
        System.out.println("| 7. Makaroni Rakyat          |   Rp 5000       |");
        System.out.println("| 8. Teh Tawar                |   Rp 2000       |");
        System.out.println("|_____________________________|_________________|");
        System.out.println("");
        
        System.out.println("________________________________________________");
        System.out.print("Masukkan Nama Anda : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Umur Anda : ");
        umur = input.nextInt();

        System.out.println("________________________________________________");
        System.out.print("Masukkan Nomor Pesanan : ");
        int input_item = input.nextInt();
        
        System.out.print("Masukkan Banyak Pesanan : ");
        int jumlah = input.nextInt();
        System.out.println("________________________________________________");

        if (input_item == 1)
        {
            menu = " Javabica ";
            harga = harga + harga_item[0] * jumlah;
            total = harga_item[0] * jumlah;
            System.out.println("Nama Customer : " + nama + ", " + umur + " Thn");
            System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jumlah+"   |  Rp. "+ total);
        }
        else if (input_item == 2)
        {
            menu = "Espresso ";
            harga = harga + harga_item[1] * jumlah;
            total = harga_item[1] * jumlah;
            System.out.println("Nama Customer : " + nama + ", " + umur + " Thn");
            System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jumlah+"   |  Rp. "+ total);
        }
        else if (input_item == 3)
        {
            menu = " Caramel Chocolate Grande ";
            harga = harga + harga_item[2] * jumlah;
            total = harga_item[2] * jumlah;
            System.out.println("Nama Customer : " + nama + ", " + umur + " Thn");
            System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jumlah+"   |  Rp. "+ total);
        }
        else if (input_item == 4)
        {
            menu = " Mocha Praline cream ";
            harga = harga + harga_item[3] * jumlah;
            total = harga_item[3] * jumlah;
            System.out.println("Nama Customer : " + nama + ", " + umur + " Thn");
            System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jumlah+"   |  Rp. "+ total);
        }
        else if (input_item == 5)
        {
            menu = " Mocha Latte without art ";
            harga = harga + harga_item[4] * jumlah;
            total = harga_item[4] * jumlah;
            System.out.println("Nama Customer : " + nama + ", " + umur + " Thn");
            System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jumlah+"   |  Rp. "+ total);
        }
        else if (input_item == 6)
        {
            menu = " Mocha Latte with art ";
            harga = harga + harga_item[5] * jumlah;
            total = harga_item[5] * jumlah;
            System.out.println("Nama Customer : " + nama + ", " + umur + " Thn");
            System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jumlah+"   |  Rp. "+ total);
        }
        else if (input_item == 7)
        {
            menu = " Makaroni Rakyat ";
            harga = harga + harga_item[6] * jumlah;
            total = harga_item[6] * jumlah;
            System.out.println("Nama Customer : " + nama + ", " + umur + " Thn");
            System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jumlah+"   |  Rp. "+ total);
        }
        else if (input_item == 8)
        {
            menu = " Teh Tawar ";
            harga = harga + harga_item[7] * jumlah;
            total = harga_item[7] * jumlah;
            System.out.println("Nama Customer : " + nama + ", " + umur + " Thn");
            System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jumlah+"   |  Rp. "+ total);
        }
        else
        {
            System.out.println("Maaf Menu Yang Anda Pilih Tidak Tersedia.");
        }
            System.out.println("Apakah anda mau memesan lagi? Y/T");
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