package Lepkom;

public class Senjata implements OpsiSenjata{
    //Ikhwan Fadhilah_51421603
    int pelor = 0;
    String[] senjata = {"Vandal", "Phantom", "Spectre", "Odin", "Operator", "Ghost"};
    Senjata(int pelor){
        this.pelor = pelor;
    }
    public void tukarSenjata(int kodesenjata){
        System.out.println("Senjata tukar ke : " + this.senjata[kodesenjata]);
    }

    public void tembakSenjata(){
        if (pelor !=0){
            System.out.println("Dor dor dor");
            this.pelor = pelor -1;
        } else{
            System.out.println("Sisa Pelor Habis");
        }
    }

    public void reloadSenjata(){
        System.out.println("Senjata direload");
        this.pelor = pelor + 7;
    }
}
