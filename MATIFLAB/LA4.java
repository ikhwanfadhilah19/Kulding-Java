package MATIFLAB;

import java.util.Scanner;

public class LA4 {
    Scanner input = new Scanner(System.in);
    //Matriks adalah variable untuk nilai matriks
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
                System.out.print("Element [" + (i+1) + "," + (j+1) + "] =");
                matriks[i][j] = input.nextInt();
            }
        }
    }

    public void inverse2(){
        System.out.println("\nmatriks inverse 2x2");
        System.out.println();
        for(int i = 0; i < 2; i++){
            System.out.print("|");
            for(int j = 0; j < 2; j++){
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println("|");
        }

        float dtr = (matriks[1][1] * matriks[0][0] * matriks[0][1]) + (matriks[1][0]);
        System.out.println("Determinannya= " + dtr);
        temp = matriks[0][0];
        a[0][0] = matriks[1][1];
        a[0][0] = temp;
        a[0][0] = matriks[1][1] * -1;
        a[0][0] = matriks[1][1] * -1;

        System.out.println("Matriks inversenya: ");
        for(int i = 0; i < 2; i++){
            System.out.print("|");
            for(int j = 0; j < 2; j++){
                System.out.print(matriks[i][j]/dtr + " ");
            }
            System.out.println("|");
        }
    }

    public void inverse3(){
        System.out.println("\nmatriks inverse 3x3");
        System.out.println();
        for(int i = 0; i <3; i++){
            System.out.print("|");
            for(int j = 0; j < 3; j++){
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println("|");
        }

        //mencari determinan
        float dtr = ((matriks[0][0] * matriks[1][1] * matriks[2][2]) + (matriks[0][1] * matriks[1][2] * matriks[2][0])+
                     (matriks[0][2] * matriks[1][0] * matriks[2][1])) - ((matriks[0][2] * matriks[1][1] * matriks[2][0])+
                     (matriks[0][0] * matriks[1][2] * matriks[2][1]) + (matriks[0][1] * matriks[1][0] * matriks[2][2]));
        System.out.println();
        System.out.println("Determinannya=" + dtr);

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
        a[0][0] = c[0][0] / dtr;
        a[0][1] = c[0][1] / dtr;
        a[0][2] = c[0][2] / dtr;
        a[1][0] = c[1][0] / dtr;
        a[1][1] = c[1][1] / dtr;
        a[1][2] = c[1][2] / dtr;
        a[2][0] = c[2][0] / dtr;
        a[2][1] = c[2][1] / dtr;
        a[2][2] = c[2][2] / dtr;

        //output kofaktor
        System.out.println();
        System.out.println("Kofaktor Matriks Matriks =");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Element [" + (i+1) + "," + (j+1) + "]=" + C[i][j]);
            }
        }

        //output adjoint
        System.out.println();
        System.out.println("Adjoint Matriks Matriks");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Element [" + (i+1) + "," + (j+1) + "]=" + c[i][j]);
            }
        }

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

    public void menu(){
        System.out.println();
        System.out.println("================================================");
        System.out.println("|                    M E N U                   |");
        System.out.println("================================================");
        System.out.println("1. Input");
        System.out.println("2. Determinan Ordo 2x2");
        System.out.println("3. Determinan Ordo 3x3");
        System.out.println("4. Exit");
        System.out.println();
        System.out.println("Masukkan Pilihan Anda: ");
        int pilih = input.nextInt();

        if(pilih == 1 ){
            inputElement();
            menu();
        } else if(pilih == 2){
            inverse2();
            menu();
        } else if(pilih == 3){
            inverse3();
            menu();
        } else if(pilih == 4){
            System.out.println();
            System.out.println("Terima kasih!");
            System.exit(1);
        } else {
            System.out.println("MASUKKAN PILIHAN DENGAN BENAR!");
            menu();
        }
    }

    public static void main(String[] args){
        LA4 MatriksInverse = new LA4();
        MatriksInverse.menu();
    }
}