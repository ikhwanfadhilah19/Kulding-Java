package Lepkom;

import java.io.*;

class Turunans {
    //Ikhwan Fadhilah_51421603
    public static void main(String[] args) throws IOException{
        String sInput = null;
        InputStreamReader inputan = new InputStreamReader(System.in);
        BufferedReader jm = new BufferedReader(inputan);

        System.out.println("====JENIS MAMALIA====");
        System.out.println("1. Ikan Paus");
        System.out.println("2. Cheetah");
        System.out.println("3. Sapi");
        System.out.println("Masukkan Pilihan : ");
        Mamalia generalx = new Mamalia();
        Paus turunan1 = new Paus();
        Cheetah turunan2 = new Cheetah();
        Sapis turunan3 = new Sapis();
        sInput = jm.readLine();
        int i = Integer.parseInt(sInput);

        switch(i){
            case 1:
                generalx.KelasMamalia();
                turunan1.TampilkanPaus();
                break;
            case 2:
                generalx.KelasMamalia();
                turunan2.TampilkanCheetah();
                break;
            case 3:
                generalx.KelasMamalia();
                turunan3.TampilkanSapi();
                break;
            default:
                System.out.println("Pilihan yang anda masukkan salah!");
                break;
        }
    }
}
