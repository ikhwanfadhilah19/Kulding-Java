package Lepkom;

class LuasSegitiga {
    double alas;
    double tinggi;
    
    void isiDat(double a, double t){
        this.alas=a;
        this.tinggi=t;
    }
}

public class No10v1 {
    public static void main(String[] args) {
        //NPM : 51421603
        LuasSegitiga a = new LuasSegitiga();

        a.isiDat(11.5, 5);

        System.out.println("alas : " +  a.alas + "cm");
        System.out.println("tinggi : " +  a.tinggi + "cm");
        System.out.println("--------------------------------");
        System.out.println("Luas Segitiga Adalah : " +  (a.alas*a.tinggi)/2 + "cm2");
    }
}
