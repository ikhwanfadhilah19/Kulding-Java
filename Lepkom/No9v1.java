package Lepkom;

class Nilai {
    double kuis;
    double tugas;

    double Akhir(){
        return(kuis + tugas)/2;
    }
}

public class No9v1 {
    public static void main(String[] args) {
        //NPM : 51421603
        Nilai n = new Nilai();

        n.kuis = 93.5;
        n.tugas = 81.5;

        System.out.println("nilai kuis : " + n.kuis);
        System.out.println("nilai tugas : " + n.tugas);
        System.out.println("-------------------------------");
        System.out.println("nilai akhir : " + n.Akhir());
    }
}
