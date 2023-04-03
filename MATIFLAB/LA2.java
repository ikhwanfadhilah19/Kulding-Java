package MATIFLAB;

import java.io.*;

public class LA2 {//Ikhwan Fadhilah_51421603
    public static void main(String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan ordo Matriks n * n: ");
        int n = Integer.parseInt(input.readLine());
        int [][] matrikA = new int [n][n];
        int [][] matrikB = new int [n][n];
        int [][] matrikC = new int [n][n];
        System.out.print("Matriks A: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("Element [" + (i + 1) + "," + (j + 1) + "] = ");
                matrikA[i][j] = Integer.parseInt(input.readLine());
            }
        }

        System.out.print("Matriks B: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("Element [" + (i + 1) + "," + (j + 1) + "] = ");
                matrikB[i][j] = Integer.parseInt(input.readLine());
            }
        }

        System.out.print("");
        for(int i = 0; i < n; i++){
            System.out.print(" | ");
            for(int j = 0; j < n; j++){
                matrikC[i][j] = matrikA[i][j] + matrikB[i][j];
                System.out.print(matrikC[i][j] + " ");
            }
                System.out.println(" | ");
        }        
    }        
}
