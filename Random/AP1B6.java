package Random;

import java.util.Scanner;

public class AP1B6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
    
        System.out.print("Masukkan Angka : ");
        angka = input.nextInt();
        
        if (angka % 2 == 0){
        System.out.println("Angka Genap");
        }
        else {
        System.out.println("Angka Ganjil");
        }
        input.close();
    }
}