package Lepkom;

//Maulana Rafiata_50421801

class kotak {
    double panjang;
    double lebar;
    double tinggi;

    kotak() {
        panjang = 2;
        lebar = 3;
        tinggi = 5;
    }

    kotak(double sisi) {
        panjang = lebar = tinggi = sisi;
    }

    kotak(double p, double l, double t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    double HitungVolume() {
        return (panjang * lebar * tinggi);
    }
}

class No10v2 {
    public static void main(String[] args) {
        kotak k1, k2, k3;
        k1 = new kotak();
        k2 = new kotak(15);
        k3 = new kotak(3, 4, 5);
        System.out.println("Volume k1 :" + k1.HitungVolume());
        System.out.println("Volume k2 :" + k2.HitungVolume());
        System.out.println("Volume k3 :" + k3.HitungVolume());
}
}