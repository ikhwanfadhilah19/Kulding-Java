package AP1BM7;

import java.util.Scanner;

public class QUIZM7AP1Bv5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan angka: ");
        int angka = input.nextInt();
        System.out.print("Masukan nilai pangkat: ");
        int pngkt = input.nextInt();

        int p = 1;
        int q = 1;

        System.out.println("Loop do while");
        do{
            q *= angka;
            p++;
        }
        while (p <= pngkt);
        System.out.println(angka + "^" + pngkt + " = " + q);
        input.close();
    }
}