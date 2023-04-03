package Lepkom;

import java.io.*;

public class act4 {//Ikhwan Fadhilah_51421603
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Pilihan: ");
        System.out.println("1. Soto Ayam");
        System.out.println("2. Nasi Rawon");
        System.out.println("3. Gulai Kambing");
        System.out.println("");

        System.out.print("Pilihan: ");
        String st = input.readLine();
        int pilihan = Integer.valueOf(st).intValue();

        switch (pilihan) {
            case 1:
                System.out.println("Pilihan Anda Soto Ayam");
                System.out.println("Silahkan Tunggu Sebentar");
                break;
            case 2:
                System.out.println("Pilihan Anda Nasi Rawon");
                System.out.println("Silahkan Tunggu Sebentar");
                break;
            case 3:
                System.out.println("Pilihan Anda Gulai Kambing");
                System.out.println("Silahkan Tunggu Sebentar");
                break;
                default:
                System.out.println("Silahkan Memilih 1, 2, atau 3");
        }
        System.out.println("Akhir Dari Switch");
    }
}
