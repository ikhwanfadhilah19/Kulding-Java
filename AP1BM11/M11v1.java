package AP1BM11;

class Kendaraan {//Overriding OOP
    public void walk() {
        System.out.println("Kendaraan dapat berjalan ketika memiliki bahan bakar");
    }
}

class Truk extends Kendaraan {
    public void walk() {
        System.out.println("Bahan bakar truk adalah solar");
    } 
}
public class M11v1 {
    public static void main(String[] args) {//Ikhwan Fadhilah_51421603
        Kendaraan p = new Kendaraan();
        Kendaraan q = new Truk();
        p.walk();
        q.walk();
    }
}
