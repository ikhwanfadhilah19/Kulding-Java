package AP1BM11;

class handphone {//Overloading OOP
    String cekInfo(int seri) {
        return "Handphone yang bernomor seri " + seri;
    }
}

class pemilik extends handphone {
    String cekInfo(String milik) {
        return "Pemiliknya adalah " + milik;
    }
}
public class M11v2 {
    public static void main(String[] args) {//Ikhwan Fadhilah_51421603
        pemilik barang = new pemilik();
        System.out.println(barang.cekInfo(876123432));
        System.out.println(barang.cekInfo("Bobi"));
    }
}
