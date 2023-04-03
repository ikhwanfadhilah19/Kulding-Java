package Random;

import java.util.Scanner;

public class ACT7 {
    public static void main(String[] args) {//Ikhwan Fadhilah_51421603
        Scanner input = new Scanner(System.in);
        int panjang, lebar;
        double luas, keliling;
        int pilih;

        System.out.println("== Menghitung Luas dan keliling persegi panjang ==");
        System.out.print("Masukan panjang : ");
        panjang = input.nextInt();
        System.out.print("Masukan lebar : ");
        lebar = input.nextInt();
        System.out.println("1. Luas\n2. Keliling");
        System.out.print("Masukan pilihan : ");
        pilih = input.nextInt();

        switch (pilih) {
            case 1:
            luas = panjang*lebar;
            System.out.println("Luas Persegi Panjang : "+luas);
            break;
            case 2:
            keliling = (2*panjang)+(2*lebar);
            System.out.println("Keliling Persegi Panjang : "+keliling);
            break;
        default:
            System.out.println("Terimakasih!");
        }
        input.close();
    }
}
