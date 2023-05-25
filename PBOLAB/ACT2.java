//Ikhwan Fadhilah_51421603

package PBOLAB;

import java.util.Scanner;

class KubusBalok{
    public double luasperm(double sisi){
        return 6 * sisi * sisi;
    }

    public double luasperm(double panjang, double lebar, double tinggi){
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}

class Bola extends KubusBalok {
    public double luasperm(double jari){
        return 4 * Math.PI * jari * jari;
    }
}

public class ACT2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        KubusBalok kb = new KubusBalok();
        //Menginput dan menghitung hasil akhir luas permukaan dari kubus
        System.out.print("Masukkan Sisi Kubus : ");
        double sisi = input.nextDouble();
        System.out.println("Luas Kubus adalah " + kb.luasperm(sisi));

        System.out.println();
        //Menginput dan menghitung hasil akhir luas permukaan dari balok
        System.out.print("Masukkan Panjang Balok : ");
        double PB = input.nextDouble();
        System.out.print("Masukkan Lebar Balok : ");
        double LB = input.nextDouble();
        System.out.print("Masukkan Tinggi Balok : ");
        double TB = input.nextDouble();
        System.out.println("Luas Balok adalah " + kb.luasperm(PB,LB,TB));

        System.out.println();

        Bola bl = new Bola();
        //Menginput dan menghitung hasil akhir luas permukaan dari bola
        System.out.print("Masukkan Jari-jari Bola : ");
        double jari = input.nextDouble();
        System.out.println("Luas Bola adalah " + bl.luasperm(jari));
    }
}