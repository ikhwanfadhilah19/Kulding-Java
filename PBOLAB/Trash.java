// package PBOLAB;

// public package PBOLAB;

// import java.util.Scanner;

// class BangunRuang {
//     double luas(){
//         return 0;
//     }
// }

// class Kubus extends BangunRuang {
//     private double sisi;

//     public Kubus(double sisi){
//        this.sisi = sisi;
//     }
    
//     double luas() {
//         return 6 * sisi * sisi;
//     }
// }

// class Balok extends BangunRuang {
//     private double panjang;
//     private double lebar;
//     private double tinggi;

//     public Balok(double panjang, double lebar, double tinggi) {
//         this.panjang = panjang;
//         this.lebar = lebar;
//         this.tinggi = tinggi;
//     }

//     double luas() {
//         return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
//     }
// }

// class Bola extends BangunRuang {
//     private double jari;

//     public Bola(double jari) {
//         this.jari = jari;
//     }

//     double luas() {
//         return 4 * Math.PI * jari * jari;
//     }
// }
// public class ACT2{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("Masukkan Sisi Kubus : ");
//         double sisi = input.nextDouble();
//         Kubus k = new Kubus(sisi);
//         System.out.println("Luas kubus adalah " + k.luas());

//         System.out.print();

//         System.out.print("Masukkan Jari-jari Bola : ");
//         double jari = input.nextDouble();
//         Bola b = new Bola(jari);
//         System.out.println("Luas bola adalah " + b.luas());
//     }
// } {
    
// }
