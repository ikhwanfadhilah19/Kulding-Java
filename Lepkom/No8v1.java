package Lepkom;

class Balok {
    int panjang;
    int lebar;
    int tinggi;
}

public class No8v1 {
    public static void main(String[] args) {
        //NPM : 51421603
        double volume;

        Balok balok = new Balok();
        balok.panjang = 12;
        balok.lebar = 10;
        balok.tinggi = 7;

        volume = balok.panjang * balok.tinggi * balok.lebar;

        System.out.println("Panjang Balok: " + balok.panjang);
        System.out.println("Lebar Balok: " + balok.lebar);
        System.out.println("Tinggi Balok: " + balok.lebar);
        System.out.println("------------------------------------");
        System.out.println("Vlume Balok: " + volume);
    }
}
