package MATIFLAB;

import java.util.Scanner;

public class Ujian {//Ikhwan Fadhilah, 51421603, 1IA26
    Scanner input = new Scanner(System.in);
    //Matriks adalah variable untuk  nilai matriks
    //a adalah variable untuk mencari nilai inverse matriks
    //c adalah variable untuk mencari nilai adjoint
    //C adalah variable untuk mencari nilai kofaktor

    int [][] matriks = new int [3][3];
    float temp;
    float [][] a = new float [3][3];
    float [][] c = new float [3][3];
    float [][] C = new float [3][3];

    public void inputElement(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Element [" + (i+1) + "," + (j+1) + "] = ");
                matriks[i][j] = input.nextInt();
            }
        }
    }

    public void determinan(){
        System.out.println("\nDeterminan 3x3");
        System.out.println();
        for(int i = 0; i <3; i++){
            System.out.print("|");
            for(int j = 0; j < 3; j++){
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println("|");
        }

        //mencari determinan
        float dtrmn = ((matriks[0][0] * matriks[1][1] * matriks[2][2]) + (matriks[0][1] * matriks[1][2] * matriks[2][0])+
                     (matriks[0][2] * matriks[1][0] * matriks[2][1])) - ((matriks[0][2] * matriks[1][1] * matriks[2][0])+
                     (matriks[0][0] * matriks[1][2] * matriks[2][1]) + (matriks[0][1] * matriks[1][0] * matriks[2][2]));
        System.out.println();
        System.out.println("Determinannya = " + dtrmn);
    }

    public void inverse(){
        float dtrmn = ((matriks[0][0] * matriks[1][1] * matriks[2][2]) + (matriks[0][1] * matriks[1][2] * matriks[2][0])+
                     (matriks[0][2] * matriks[1][0] * matriks[2][1])) - ((matriks[0][2] * matriks[1][1] * matriks[2][0])+
                     (matriks[0][0] * matriks[1][2] * matriks[2][1]) + (matriks[0][1] * matriks[1][0] * matriks[2][2]));
        
        //mencari kofaktor
        C[0][0] = (matriks[1][1] * matriks[2][2] - matriks[1][2] * matriks[2][1]);
        C[0][1] = -1 * (matriks[1][0] * matriks[2][2] - matriks[1][2] * matriks[2][0]);
        C[0][2] = (matriks[1][0] * matriks[2][1] - matriks[1][1] * matriks[2][0]);
        C[1][0] = -1 * (matriks[0][1] * matriks[2][2] - matriks[0][2] * matriks[2][1]);
        C[1][1] = (matriks[0][0] * matriks[2][2] - matriks[0][2] * matriks[2][0]);
        C[1][2] = -1 * (matriks[0][0] * matriks[2][1] - matriks[0][1] * matriks[2][0]);
        C[2][0] = (matriks[0][1] * matriks[1][2] - matriks[0][2] * matriks[1][1]);
        C[2][1] = -1 * (matriks[0][0] * matriks[1][2] - matriks[0][2] * matriks[1][0]);
        C[2][2] = (matriks[0][0] * matriks[1][1] - matriks[0][1] * matriks[1][0]);

        /*
         * mencari adjoint matriks a dimana adjoint matriks matriks adalah transpose dari kofaktor matriks matriks
         */

        c[0][0] = C[0][0];
        c[0][1] = C[1][0];
        c[0][2] = C[2][0];
        c[1][0] = C[0][1];
        c[1][1] = C[1][1];
        c[1][2] = C[2][1];
        c[2][0] = C[0][2];
        c[2][1] = C[1][2];
        c[2][2] = C[2][2];

         /*
          * mencari nilai matriks matriks, yaitu hasil antara adjoint dengan determinan matriks matriks
          */
        a[0][0] = c[0][0] / dtrmn;
        a[0][1] = c[0][1] / dtrmn;
        a[0][2] = c[0][2] / dtrmn;
        a[1][0] = c[1][0] / dtrmn;
        a[1][1] = c[1][1] / dtrmn;
        a[1][2] = c[1][2] / dtrmn;
        a[2][0] = c[2][0] / dtrmn;
        a[2][1] = c[2][1] / dtrmn;
        a[2][2] = c[2][2] / dtrmn;

        System.out.println();
        System.out.println("Matriks inversenya: ");
        for(int i = 0; i < 3; i++){
            System.out.print("|");
            for(int j = 0; j < 3; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public void menupilihan(){
        System.out.println();
        System.out.println(" ============================================== ");
        System.out.println("|                    M E N U                   |");
        System.out.println(" ============================================== ");
        System.out.println("|1. Input                                      |");
        System.out.println("|2. Determinan 3x3                             |");
        System.out.println("|3. Inverse 3x3                                |");
        System.out.println("|4. Exit                                       |");
        System.out.println(" ============================================== ");
        System.out.println();
        System.out.print("Masukkan Pilihan Anda: ");
        int pilih = input.nextInt();

        if(pilih == 1 ){
            inputElement();
            menupilihan();
        } else if(pilih == 2){
            determinan();
            menupilihan();
        } else if(pilih == 3){
            inverse();
            menupilihan();
        } else if(pilih == 4){
            System.out.println();
            System.out.println("Terima kasih!");
            System.exit(1);
        } else {
            System.out.println("MASUKKAN PILIHAN DENGAN BENAR!");
            menupilihan();
        }
    }

    public static void main(String[] args){
        Ujian MatriksInverse = new Ujian();
        MatriksInverse.menupilihan();
    }
}