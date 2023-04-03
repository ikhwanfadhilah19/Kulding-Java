package AP1BM9;

class Mendaki {//ikhwan fadhilah_51421603
    String namagunung;
    String jalurgunung;
    int berjalan = 0;
    int summit = 0;

    void namagunung(String nama) {
        namagunung = nama;
        System.out.println("Nama Gunung\t: "+namagunung);
    }

    void jalurgunung(String jalur) {
        jalurgunung = jalur;
        System.out.println("Jalur Gunung\t: "+jalurgunung);
    }

    void waktujalan(int jalan) {
        berjalan = berjalan+ jalan;
        System.out.println("Waktu jalan\t: "+berjalan+" Jam");
    }

    void summitattack(int puncak) {
        summit = summit+ puncak;
        System.out.println("Waktu Summit\t: "+"Jam "+summit+" Pagi");
    }
}
