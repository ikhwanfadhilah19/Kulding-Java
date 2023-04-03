package Random;

import java.util.Scanner;

public class AP1B1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nilai Pertama Anda :");
        int nilai1 = input.nextInt();
        System.out.print("Masukan Nilai Ketiga Anda  :");
        int nilai2 = input.nextInt();
        System.out.print("Masukan Nilai Kedua Anda   :");
        int nilai3 = input.nextInt();

        int nilaiakhir =(nilai1+nilai2+nilai3)/3;

        if(nilaiakhir>=60){
            System.out.println("Nilai Anda" + nilaiakhir + ":)");
        }
        else {
            System.out.println("Maaf Anda Tidak Lulus");
        }input.close();
    }
}