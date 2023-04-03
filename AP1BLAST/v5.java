package AP1BLAST;

class Kotakv2 {
    double panjang, lebar, tinggi;

    void cetakVolume(){
        System.out.println(hitungVolume());
    }

    double hitungVolume(){
        double vol = panjang * lebar * tinggi;
        return vol;
    }
}

public class v5 {
    public static void main(String[] args) {
        Kotakv2 k1, k2, k3;

        k1 = new Kotakv2();
        k2 = new Kotakv2();
        k3 = new Kotakv2();

        k1.panjang = 4;
        k1.lebar = 3;
        k1.tinggi = 2;

        k2.panjang = 6;
        k2.lebar = 5;
        k2.tinggi = 4;

        k3.panjang = 8;
        k3.lebar = 7;
        k3.tinggi = 6;

        k1.cetakVolume();
        k2.cetakVolume();
        k3.cetakVolume();
    }
}