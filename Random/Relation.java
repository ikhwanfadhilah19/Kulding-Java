package Random;

import java.util.Scanner;

public class Relation {//Ikhwan Fadhilah_51421603
    Scanner input = new Scanner(System.in);
    int[] himpunanA = new int[100];
    int[] himpunanB = new int[100];
    int[] himpunanHasil = new int[100];
    int jumlahAnggotaA, jumlahAnggotaB;
    int jumlahRelasi, jumlahRelasiMax;
    
    public void inputAnggota() {
        System.out.print("Masukkan Jumlah Anggota Himpunan : ");
        jumlahAnggotaA = input.nextInt();
        System.out.println("Anggota Himpunan A");
        
        for (int i = 1; i <= jumlahAnggotaA; i++) {
            System.out.print("Anggota "+i+" : ");
            himpunanA[i] = input.nextInt();
        }
            System.out.print("Masukkan Jumlah Anggota B : ");
            jumlahAnggotaB = input.nextInt();
            
            System.out.println("Anggota Himpunan B:");
            for (int i = 1; i <= jumlahAnggotaB; i++) {
                System.out.print("Anggota "+i+" : ");
                himpunanB[i] = input.nextInt();
            }
            int jmlRelasiMaks = jumlahAnggotaA * jumlahAnggotaB;
            System.out.println("Banyak Relasi maksimal yang terjadi Adalah " + jmlRelasiMaks);
            
            do {
                System.out.print("Masukkan Jumlah Relasi terjadi : ");
                jumlahRelasi = input.nextInt();
                
            } while (jumlahRelasi > jmlRelasiMaks);
    }
    public void inputRelasi() {
        System.out.println("Masukkan Relasi yang terjadi : ");
        for (int i = 1; i <= jumlahRelasi; i++) {
            int anggA[] = new int[100];
            int anggB[] = new int[100];
            boolean SamaA = false;
            boolean SamaB = false;

            System.out.println("Relasi ke " + i + " : ");
            do {
                System.out.print("Masukan Asal A : ");
                anggA[i] = input.nextInt();
                System.out.print("Masukan Tujuan B : ");
                anggB[i] = input.nextInt();

                for (int j = 1; j <= jumlahAnggotaA; j++) {
                    if (anggA[j]==(himpunanA[j])){
                        SamaA = true;
                    }
                }
                for (int k = 1; k <= jumlahAnggotaB; k++) {
                    if (anggB[k]==(himpunanB[k])){
                        SamaB = true;
                    }
                }
                if (SamaA == false || SamaB == false) {
                    System.out.println("Anggota Himpunan Tidak terdapat di himpunan A atau B");
                }
                if (SamaA == true && SamaB == true) {
                    himpunanHasil[i] = anggB[i];
                }

            } while (SamaA == false || SamaB == false);
    }
}
    public void cetakRelasi() {
        System.out.print("Daerah Domain = { ");
        for (int i = 1; i <= jumlahAnggotaA; i++) {
            System.out.print(himpunanA[i] + " ");
        }
        System.out.println("}");

        System.out.print("Daerah Kodomain { ");
            for (int i = 1; i <= jumlahAnggotaB; i++) {
                System.out.print(himpunanB[i] + " ");
        }
        System.out.println("}");

        System.out.print("Daerah range adalah : { ");
        for (int i = 1; i <= jumlahRelasi; i++) {
             System.out.print(himpunanHasil[i] + " ");
    }
    System.out.println("}");
}

    public static void main(String[] args) {
        Relation A = new Relation();
        A.inputAnggota();
        A.inputRelasi();
        A.cetakRelasi();
    }
}