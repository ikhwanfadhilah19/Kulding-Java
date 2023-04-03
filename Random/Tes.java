package Random;

import java.util.Scanner;

public class Tes {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Tes ujian = new Tes();
        ujian.menu();
    }
    void menu() {
        System.out.println("=====MENU=====");
        System.out.println("1. Biodata");
        System.out.println("2. Nilai Akhir");
        System.out.println("3. Luas Persegi Panjang");
        System.out.println("4. Angka Ganjil Genap");
        System.out.println("5. Segitiga Bintang");
        System.out.println("6. Keluar");
        System.out.print("\nMasukan Pilihan: ");
        int pil = input.nextInt();

        switch(pil) {
            case 1:
                biodata();
                menu();
            break;
            case 2:
                nilaiakhir();
                menu();
            case 3:
                System.out.println("=====Persegi Panjang=====");
                int p, l;
                System.out.print("Masukan Panjang: ");
                p = input.nextInt();
                System.out.print("Masukan Lebar: ");
                l = input.nextInt();
                System.out.println("Luas Persegi Panjang: "+lpersegipanjang(p,l));
                menu();
            break;
            case 4:
                angka();
                menu();
            break;
            case 5:
                segitiga();
                menu();
            break;
            case 6:
                keluar();
            break;
            default:
            menu();
        }
    }
    void biodata() {
        System.out.println("=====Biodata=====");
        System.out.print("Masukan Nama  : ");
        String nama = input.next();
        System.out.print("Masukan NPM   : ");
        String npm = input.next();
        System.out.print("Masukan Kelas : ");
        String kelas = input.next();
        System.out.println("=====Hasil=====");
        System.out.println("Nama        : "+nama);
        System.out.println("NPM         : "+npm);
        System.out.println("Kelas       : "+kelas);
    }
    void nilaiakhir() {
        double nilai;
        System.out.println("=====SILAHKAN ISI=====");
        System.out.print("Mata Kuliah   : ");
        String matakuliah = input.next();
        System.out.print("Masukan Nilai UTS : ");
        int uts = input.nextInt();
        System.out.print("Masukan Nilai UAS : ");
        int uas = input.nextInt();
        System.out.println("=====HASIL=====");
        nilai = (0.7*uts) + (0.3*uas);
        if (nilai >= 86) {
            System.out.println("Mata Kuliah : "+matakuliah);
            System.out.println("Total Nilai : "+nilai);
            System.out.println("Grade       : A");
        }
        else if (nilai >= 71 && nilai <=85) {
            System.out.println("Mata Kuliah : "+matakuliah);
            System.out.println("Total Nilai : "+nilai);
            System.out.println("Grade       : B");
        }
        else if (nilai >= 61 && nilai <=70) {
            System.out.println("Mata Kuliah : "+matakuliah);
            System.out.println("Total Nilai : "+nilai);
            System.out.println("Grade       : C");
        }
        else { System.out.println("Mata Kuliah : "+matakuliah);
        System.out.println("Total Nilai : "+nilai);
        System.out.println("Maaf anda harus mengulang kembali ujian.");
        }
    }
    int lpersegipanjang(int p, int l) {
        int luas;
        luas = p*l;
        return luas;
    }
    void angka() {
        System.out.println("=====Angka Ganjil Genap=====");
        int angka;
        System.out.print("Masukkan Angka : ");
        angka = input.nextInt();
        
        if (angka % 2 == 0){
        System.out.println(angka+" adalah Angka Genap");
        }
        else {
        System.out.println(angka+" adalah Angka Ganjil");
        }
    }
    void segitiga() {
        System.out.println("=====Segitiga Bintang=====");
        int n;
        System.out.print("Masukan Tinggi : ");
        n = input.nextInt();
        for(int i = 1; i <=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    void keluar() {
        System.out.println("Good Bye, Thankyou!");
        System.exit(0);
    }
}