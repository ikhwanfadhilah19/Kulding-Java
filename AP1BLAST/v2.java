package AP1BLAST;

class Kotak {
    double panjang;
    double lebar;
    double tinggi;
}
class v2 {
    public static void main(String[] args) {
        
        double volume;
        Kotak k = new Kotak();

        k.panjang = 4;
        k.lebar = 3;
        k.tinggi = 2;

        volume = k.panjang * k.tinggi * k.lebar;

        System.out.println("Volume kotak = " + volume);
    }
}