package AP1BM7;

import java.util.Scanner;

public class QUIZM7AP1Bv6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan angka: ");
        int angka = input.nextInt();
        System.out.print("Masukan nilai pangkat: ");
        int pngkt = input.nextInt();

        int q = 1;

        System.out.println("Loop for");
        for(int p = 1; p <= pngkt; p++){
            q *= angka;
        }
        System.out.println(angka + "^" + pngkt + " = " + q);
        input.close();
    }
}