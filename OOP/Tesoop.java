package OOP;

import java.util.Scanner;

class MahasiswaPBO {
    private String Nama, NPM;
    private double NilUTS, NilTugasMhs;

    public MahasiswaPBO(String Nama, String NPM) {
        this.Nama = Nama;
        this.NPM = NPM;
    }

    public void setNILUTS(double NilUTS){
        this.NilUTS = NilUTS;
    }

    public void setNILTUGASMHS(double NilTugasMhs) {
        this.NilTugasMhs = NilTugasMhs;
    }

    public String getNAMA(){
        return Nama;
    }

    public String getNPM(){
        return NPM;
    }

    public double getNILUTS(){
        return NilUTS;
    }

    public double getNILTUGASMHS(){
        return NilTugasMhs;
    }
}

class MahasiswaPBO25 extends MahasiswaPBO{
    public boolean hadirUTS;

    public MahasiswaPBO25(String Nama, String Npm){
        super(Nama, Npm);
    }

    public void sethadirUTS(boolean hadirUTS){
        this.hadirUTS = hadirUTS;
    }

    public boolean gethadirUTS(){
        return hadirUTS;
    }
}

public class Tesoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Mahasiswa : ");
        String nama = input.nextLine();
        System.out.print("Masukkan NPM Mahasiswa : ");
        String npm = input.nextLine();
        MahasiswaPBO25 value = new MahasiswaPBO25(nama, npm);
        System.out.print("Apakah anda hadir kelas? ");
        value.hadirUTS = input.nextBoolean();

        if (value.hadirUTS == true ){
            System.out.print("Masukkan Nilai UTS : ");
            double niluts = input.nextDouble();
            value.setNILUTS(niluts);
            System.out.print("Masukkan Nilai Tugas : ");
            double niltugas = input.nextInt();
            value.setNILTUGASMHS(niltugas);

            System.out.println();
        
            System.out.println("Nama : " + value.getNAMA());
            System.out.println("NPM : " + value.getNPM());
            System.out.println("Hadir UTS : " + value.gethadirUTS());
            System.out.println("Nilai UTS : " + value.getNILUTS());
            System.out.println("Nilai Tugas : " + value.getNILTUGASMHS());
        }else if (value.hadirUTS == false){
            System.out.print("Anda harus hadir terlebih dahulu!");
        } 
    }   
}
