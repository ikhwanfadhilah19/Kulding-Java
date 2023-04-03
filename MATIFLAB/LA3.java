package MATIFLAB;

import java.util.Scanner;

public class LA3 {//Ikhwan Fadhilah_51421603
    Scanner input = new Scanner(System.in);
    int[][] matriksA = new int[2][2];
    int[][] matriksB = new int[3][3];

    public void input(){
        System.out.println(" ========================== ");
        System.out.println("|     ORDO MATRIKS 2X2     |");
        System.out.println(" ========================== ");
        System.out.print("Masukkan Element Matriks: ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print("Element [" + (i+1) + " , " + (j+1) + "]=");
                matriksA[i][j] = input.nextInt();
            }
        }

        System.out.println(" ========================== ");
        System.out.println("|     ORDO MATRIKS 3X3     |");
        System.out.println(" ========================== ");
        System.out.print("Masukkan Element Matriks: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Element [" + (i+1) + " , " + (j+1) + "]=");
                matriksB[i][j] = input.nextInt();
            }
        }
    }

    public void ordoX(){
        for(int i = 0; i < 2; i++){
            System.out.print("|");
            for(int j = 0; j <2; j++){
                System.out.print(matriksA[i][j] + " ");
            }
            System.out.println("|");
        }
        int hasilDeterminan = (matriksA[1][1] * matriksA[0][0]) - (matriksA[1][0] * matriksA[0][1]);
        System.out.println("Determinan: " + hasilDeterminan);
    }

    public void ordoXX(){
        for(int i = 0; i < 3; i++){
            System.out.print("|");
            for(int j = 0; j <3; j++){
                System.out.print(matriksB[i][j] + " ");
            }
            System.out.println("|");
        }
        int hasilDeterminan = ((matriksB[0][0] * matriksB[1][1] * matriksB[2][2]) + 
                                (matriksB[0][1] * matriksB[1][2] * matriksB[2][0]) +
                                (matriksB[0][2] * matriksB[1][0] * matriksB[2][1])) -
                                ((matriksB[0][2] * matriksB[1][1] * matriksB[2][0]) +
                                (matriksB[0][0] * matriksB[1][2] * matriksB[2][1]) +
                                (matriksB[0][1] * matriksB[1][0] * matriksB[2][2]));
        System.out.println("Determinan: " + hasilDeterminan);
    }

    public void menu(){
        System.out.println();
        System.out.println(" =================================== ");
        System.out.println("|          MENU DETERMINAN          |");
        System.out.println(" =================================== ");
        System.out.println("|1. Input Element                   |");
        System.out.println("|2. Determinan Ordo 2x2             |");
        System.out.println("|3. Determinan Ordo 3x3             |");
        System.out.println("|4. Exit                            |");
        System.out.println(" =================================== ");
        System.out.print("Masukkan Pilihan: ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                input();
                menu();
                break;
            case 2:
                ordoX();
                menu();
                break;
            case 3:
                ordoXX();
                menu();
                break;
            case 4:
                System.out.println();
                System.out.println("Terima kasih!");
                System.exit(0);
            default:
                System.out.println("Masukkan Pilihan Dengan Benar!!!");
                break;
        }
    }

    
    public static void main(String[] args){
        LA3 call = new LA3();
        call.menu();
    }
}