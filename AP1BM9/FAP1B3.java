package AP1BM9;

class Reptile {//ikhwan fadhilah_51421603
    void hewan() {
        String namahewan = "Ular";
        String jenismakan = "Mencit";
        System.out.println("Nama Hewan\t: "+namahewan);
        System.out.println("Makanan \t: "+jenismakan);
    }
}
class Reptile2 extends Reptile {
    void hewan() {
        String namahewan = "Iguana";
        String jenismakan = "Buah";
        System.out.println("Nama Hewan\t: "+namahewan);
        System.out.println("Makanan \t: "+jenismakan);
    }
}

class Reptile3 extends Reptile {
    void hewan() {
        String namahewan = "Kura-kura";
        String jenismakan = "Udang";
        System.out.println("Nama Hewan\t: "+namahewan);
        System.out.println("Makanan \t: "+jenismakan);
    }
}

public class FAP1B3 {
    public static void main(String[] args) {
        Reptile reptile = new Reptile();
        Reptile2 reptile2 = new Reptile2();
        Reptile3 reptile3 = new Reptile3();

        System.out.println("======DAFTAR REPTILE=====");
        
        reptile.hewan();

        reptile = reptile2;
        reptile2.hewan();

        reptile = reptile3;
        reptile3.hewan(); 
    }
}