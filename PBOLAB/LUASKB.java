//Ikhwan Fadhilah_51421603

package PBOLAB;

import java.util.Scanner;

class LPKubus{
    int sisi = 6;

    public LPKubus(int sisi){
       this.sisi = sisi;
    }
    
    int luas(int sisi) {
        return 6 * sisi * sisi;
    }
}

class LPBalok{
    int panjang;
    int lebar;
    int tinggi;

    public LPBalok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    int luas() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}

public class LUASKB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Sisi Kubus : ");
        int sisiKubus = input.nextInt();
        LPKubus kubus = new LPKubus(sisiKubus);
        System.out.println("Luas kubus adalah " + kubus.luas(sisiKubus));

        System.out.println();

        System.out.print("Masukkan Panjang Balok : ");
        int PB = input.nextInt();
        System.out.print("Masukkan Lebar Balok : ");
        int LB = input.nextInt();
        System.out.print("Masukkan Tinggi Balok : ");
        int TB = input.nextInt();

        LPBalok balok = new LPBalok(PB, LB, TB);
        System.out.println("Luas Balok Adalah " + balok.luas());
    }
}