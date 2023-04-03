package MATIFLAB;

import java.io.*;

public class LA1{//Ikhwan Fadhilah_51421603
    public static void main(String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            int[] jumlah = new int[10];
            int[] vec1 = new int[10];
            int[] vec2 = new int[10];
            System.out.print("Masukkan jumlah element vektor: ");
            int n = Integer.parseInt(input.readLine());

            System.out.println("Vektor 1 ");
            for(int i = 0; i < n; i++){
                System.out.print("Element[1," + (i + 1) + "] = ");
                vec1[i] = Integer.parseInt(input.readLine());
            }

            System.out.println("Vektor 2 ");
            for(int i = 0; i < n; i++){
                System.out.print("Element[1," + (i + 1) + "] = ");
                vec2[i] = Integer.parseInt(input.readLine());
            }

            System.out.print("\nPenjumlahan Vektor : [ ");
            for(int i = 0; i < n; i++){
                jumlah[i] = vec1[i] + vec2[i];
                System.out.print(jumlah[i]);
                if(i != n - 1){
                    System.out.print(" , ");
                }
            }
            System.out.print(" ] ");

            System.out.print("\nPengurangan Vektor : [ ");
            for(int i = 0; i < n; i++){
                jumlah[i] = vec1[i] - vec2[i];
                System.out.print(jumlah[i]);
                if(i != n - 1){
                    if(jumlah[i] < 0){
                        System.out.print(" Vektor berlawanan arah");
                    }
                System.out.print(" , ");
                }
            }
            System.out.print(" ]");
    }
}