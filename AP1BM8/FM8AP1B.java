package AP1BM8;

import java.util.Scanner;

public class FM8AP1B{//Ikhwan Fadhilah_51421603
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Memasukan Data
        String[] barang = {"Sampoerna", "Gudang Garam", "Camel", "Esse", "Marlboro", "Signature"};
        System.out.println("=======================");
        System.out.println("Daftar Warung Rokok 666");
        System.out.println("=======================");
        
        //Membuat Perulangan
        for (int p=1; p < barang.length; p++) {
            System.out.print(p + ". ");
            System.out.println( barang[p] );
        }

        //Membuat Input untuk User
        System.out.print("Pilih yang ingin anda beli: ");
        int rokok = input.nextInt();
        System.out.println("Rokok yang anda pilih adalah " + barang[rokok]);
        System.out.println("Terimakasih sudah berbelanja di warung kami:)");
        input.close();
    }
}