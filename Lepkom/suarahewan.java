package Lepkom;

public class suarahewan {
    public static void main(String[] args) {
        //Ikhwan Fadhilah_51421603
        hewan HEWAN = new hewan();
        kuda KUDA = new kuda() ;
        kucing KUCING = new kucing();
        ayam AYAM = new ayam();

        HEWAN.suara();

        HEWAN = KUDA;
        HEWAN.suara();

        HEWAN = KUCING;
        HEWAN.suara();

        HEWAN = AYAM;
        HEWAN.suara();
    }
}
