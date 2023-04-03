package LAMATIF;

import java.util.Scanner;

public class Fungsi {//Ikhwan Fadhilah_51421603

    int[] HimpunanA;
    int[] HimpunanB;
    int[] HimpunanRelasi;
    int[] HimpunanAsal;
    int jmlHimpunanA, jmlHimpunanB, jmlRelasi;
    Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        Fungsi himpunan = new Fungsi();
        himpunan.inputAnggota();
        himpunan.cetakHimpunan();
        himpunan.inputRelasi();
        himpunan.cekFungsi();
        himpunan.cetakRelasi();
    }
    public void inputAnggota(){
        System.out.print("Masukkan Jumlah Himpuan A = ");
        jmlHimpunanA = input.nextInt();
        HimpunanA = new int[jmlHimpunanA];
        for(int i = 0; i<=(jmlHimpunanA-1);i++){
            System.out.print("Himpunan A yang ke "+ (i+1)+" : ");
            HimpunanA[i] = input.nextInt();
        }

        System.out.print("Masukkan Jumlah Himpunan B = ");
        jmlHimpunanB = input.nextInt();
        HimpunanB = new int [jmlHimpunanB];
        for(int i = 0; i<=(jmlHimpunanB-1);i++){
            System.out.print("Himpunan B yang ke "+ (i+1)+" : ");
            HimpunanB[i] = input.nextInt();
        }
    }
    public void cetakHimpunan(){
        System.out.print("Anggota Himpunan A = { ");
        for(int i = 0; i<= (jmlHimpunanA-1);i++){
            System.out.print(HimpunanA[i]+ " ");
        }
        System.out.println("} ");

        System.out.print("Anggota Himpunan B = { ");
        for(int i = 0; i<=(jmlHimpunanB-1);i++){
            System.out.print(HimpunanB[i]+" ");
        }
        System.out.println("} ");
    }
    public void inputRelasi(){
        int jmlRelasiMaks = jmlHimpunanA * jmlHimpunanB;
        System.out.print("Relasi Maksimal Adalah "+jmlRelasiMaks);
        System.out.println(" ");

        do{
            System.out.print("Masukkan Jumlah Relasi yang Terjadi : ");
            jmlRelasi = input.nextInt();
        }while(jmlRelasi>jmlRelasiMaks);

        HimpunanRelasi = new int[jmlRelasi];
        HimpunanAsal = new int[jmlRelasi];
        System.out.println("Masukkan Relasi yang Terjadi : ");
        for(int i=0; i<=(jmlRelasi-1);i++){
            int[] temp = new int[jmlRelasi];
            int[] temp2 = new int[jmlRelasi];
            boolean SamaA = false;
            boolean SamaB = false;

            System.out.println("Relasi ke "+(i+1)+" : ");
            do{
                System.out.print("Masukkan Asal A : ");
                temp[i] = input.nextInt();
                System.out.print("Masukkan Tujuan B : ");
                temp2[i] = input.nextInt();

                for(int j=0; j<=(jmlHimpunanA-1);j++){
                    if(temp[i]==HimpunanA[j]){
                        SamaA = true;
                    }
                }
                for(int k=0; k<=(jmlHimpunanB-1);k++){
                    if(temp2[i]==HimpunanB[k]){
                        SamaB = true;
                    }
                }
                if(SamaA==false || SamaB==false){
                    System.out.println("Anggota Himpunan Tidak terdapat dihimpunan A atau B");
                }
                if(SamaA==true && SamaB==true){
                    HimpunanRelasi[i]=temp2[i];
                    HimpunanAsal[i]=temp[i];
                }
            }while(SamaA==false || SamaB==false);
        }
    }
    public void cekFungsi(){
        int jumlahAnggota = 0;
        boolean adaSama = false;

        for(int i=0; i<=(jmlHimpunanA-1); i++){
            for(int j=0; j<=(jmlRelasi-1); j++){
                if(HimpunanA[i]==HimpunanAsal[j]){
                    jumlahAnggota++;
                }
            }
        }
        for(int i=0; i<=(jmlRelasi-1); i++){
            for(int j=i+1; j<=(jmlRelasi-1); j++){
                if(HimpunanAsal[i]==HimpunanAsal[j]){
                    adaSama=true;
                }
            }
        }

        if(jumlahAnggota==jmlHimpunanA && adaSama == false){
            System.out.println("Relasi yang di Input adalah Fungsi");
        }else{
            System.out.println("Relasi yang di Input Bukan Fungsi hanya relasi biasa");
        }
    }
    public void cetakRelasi(){
        System.out.print("Daerah Domain = { ");
        for(int i=0; i<=jmlHimpunanA-1; i++){
            System.out.print(HimpunanA[i]+" ");
        }
        System.out.println("}");

        System.out.print("Daerah Kodomain = { ");
        for(int i=0; i<=jmlHimpunanB-1; i++){
            System.out.print(HimpunanB[i]+" ");
        }
        System.out.println("}");

        System.out.print("Daerah Range adalah : { ");
            for(int i=0; i<=jmlRelasi-1; i++){
                boolean adaSama=false;
                for(int j=i+1; j<=jmlRelasi-1; j++){
                    if(HimpunanRelasi[i]==HimpunanRelasi[j]){
                    adaSama=true;
                }
            }
            if(adaSama==false)System.out.print(HimpunanRelasi[i]+" ");
        }
        System.out.println("}");
    }
}