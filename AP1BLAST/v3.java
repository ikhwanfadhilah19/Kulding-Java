package AP1BLAST;

class Kotakv3 {
    double panjang;
    double lebar;
    double tinggi;
}
class v3 {
    public static void main(String[] args) {

        double volume1, volume2;

        Kotakv3 k1 = new Kotakv3();
        Kotakv3 k2 = new Kotakv3();

        k1.panjang = 4;
        k1.lebar = 3;
        k1.tinggi = 2;

        k2.panjang = 6;
        k2.lebar = 5;
        k2.tinggi = 4;

        volume1 = k1.panjang * k1.tinggi * k1.lebar;

        volume2 = k2.panjang * k2.tinggi * k2.lebar;

        System.out.println("Volume k1 = " + volume1);
        System.out.println("Volume k2 = " + volume2);
    }
}