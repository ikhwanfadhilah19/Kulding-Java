package Lepkom;

import java.io.*;

public class act1 {//Ikhwan Fadhilah_51421603
    public static void main(String[] args) {
        BufferedReader streamTeks = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Masukkan Suatu String : ");

        String st = "";

        try {
            st = streamTeks.readLine();
        }
        catch(IOException i) {

        }

        System.out.println("String : " + st);
    }
}