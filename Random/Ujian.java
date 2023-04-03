package Random;

import java.util.Scanner;

public class Ujian {//Ikhwan Fadhilah_51421603
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Ujian la = new Ujian();
        la.menu();
    }
    void menu() {
        System.out.println("=====MENU=====");
        System.out.println("1. Biodata");
        System.out.println("2. Segitiga Bintang");
        System.out.println("3. Keluar");
        System.out.print("\nMasukan Pilihan: ");

        int pil = input.nextInt();

        switch(pil) {
            case 1:
                biodata();
                menu();
            break;
            case 2:
                segitiga();
                menu();
            break;
            case 3:
                keluar();
            break;
            default:
            menu();
        }
    }
    void biodata() {
        System.out.println("=====Biodata=====");
        System.out.print("Masukan Nama\t: ");
        String nama = input.next();
        System.out.print("Masukan Kelas\t: ");
        String kelas = input.next();
        System.out.print("Masukan NPM\t: ");
        String npm = input.next();
        System.out.print("Masukan Nilai\t: ");
        String nilai = input.next();
        System.out.println("=====Hasil=====");
        System.out.println("Nama\t: "+nama);
        System.out.println("Kelas\t: "+kelas);
        System.out.println("NPM\t: "+npm);
        System.out.println("Nilai\t: "+nilai);
        System.out.println();
    }
    void segitiga() {
        System.out.println("=====Segitiga Bintang=====");
        int n;
        System.out.print("Masukan Tinggi : ");
        n = input.nextInt();
        for (int i=n; i>0; i--) {
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void keluar() {
        System.out.println("Thankyou!, Nice to meet you:)");
        System.exit(0);
    }
}