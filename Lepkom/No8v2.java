package Lepkom;

//Maulana Rafiata_50421801

class Perkalian {
    int kali(int a, int b) {
        return a * b;
    }

    double kali(double a, double b) {
        return a * b;
    }
}

class No8v2 {
    public static void main(String[] args) {
        Perkalian perkalian = new Perkalian();
        int y = perkalian.kali(5, 4);
        double x = perkalian.kali(5.5, 4);

        System.out.println("Hasil Kali Tipe Int :" + y);
        System.out.println("Hasil Kali Tipe Double :"+x);
    }
}