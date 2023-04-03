package Random;

import java.util.Scanner;

public class M6AP1B {//ikhwan fadhilah(51421603)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilai;

        System.out.print("Masukan Nama  : ");
        String nama = input.nextLine();
        System.out.print("Masukan NPM   : ");
        String npm = input.nextLine();
        System.out.print("Masukan Kelas : ");
        String kelas = input.nextLine();
        System.out.print("Mata Kuliah   : ");
        String matakuliah = input.nextLine();

        System.out.print("Masukan Nilai UTS : ");
        int uts = input.nextInt();
        System.out.print("Masukan Nilai UAS : ");
        int uas = input.nextInt();

        nilai = (0.7*uts) + (0.3*uas);
        if (nilai >= 86) {
            System.out.println("Nama        : "+nama);
            System.out.println("NPM         : "+npm);
            System.out.println("Kelas       : "+kelas);
            System.out.println("Mata Kuliah : "+matakuliah);
            System.out.println("Total Nilai : "+nilai);
            System.out.println("Grade       : A");
        }
        else if (nilai >= 71 && nilai <=85) {
            System.out.println("Nama        : "+nama);
            System.out.println("NPM         : "+npm);
            System.out.println("Kelas       : "+kelas);
            System.out.println("Mata Kuliah : "+matakuliah);
            System.out.println("Total Nilai : "+nilai);
            System.out.println("Grade       : B");
        }
        else if (nilai >= 61 && nilai <=70) {
            System.out.println("Nama        : "+nama);
            System.out.println("NPM         : "+npm);
            System.out.println("Kelas       : "+kelas);
            System.out.println("Mata Kuliah : "+matakuliah);
            System.out.println("Total Nilai : "+nilai);
            System.out.println("Grade       : C");
        }
        else {
            System.out.println("Nama        : "+nama);
            System.out.println("NPM         : "+npm);
            System.out.println("Kelas       : "+kelas);
            System.out.println("Mata Kuliah : "+matakuliah);
            System.out.println("Total Nilai : "+nilai);
            System.out.println("Maaf anda harus mengulang kembali ujian.");
        }
        input.close();
    }
}