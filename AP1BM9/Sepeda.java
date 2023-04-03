package AP1BM9;

class Sepeda {
    int kecepatan;
    int gir;
 
    void ubahGir(int pertambahanGir){
        gir = gir + pertambahanGir;
        System.out.println("Gir: " + gir);
    }

    void tambahKecepatan(int pertambahanKecepatan){
        kecepatan = kecepatan + pertambahanKecepatan;
        System.out.println("Kecepatan: " + kecepatan);
    }
}