package PBOLAB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input sisi kubus
        System.out.print("Masukkan sisi kubus: ");
        double sisiKubus = input.nextDouble();
        Kubus kubus = new Kubus(sisiKubus);
        System.out.println("Luas kubus adalah " + kubus.luas());

        // Input panjang, lebar, dan tinggi balok
        System.out.print("Masukkan panjang balok: ");
        double panjangBalok = input.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double lebarBalok = input.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        double tinggiBalok = input.nextDouble();
        Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
        System.out.println("Luas balok adalah " + balok.luas());
    }
}

class Kubus {
    double sisi;

    Kubus(double sisi) {
        this.sisi = sisi;
    }

    double luas() {
        return 6 * sisi * sisi;
    }
}

class Balok {
    double panjang;
    double lebar;
    double tinggi;

    Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    double luas() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}