package LUAS;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Luas_Segitiga {
    public static void main(String[] args) {
        //Membuat objek scanner(jika menggunakan).
        Scanner input = new Scanner(System.in);

        //Membuat variable yang dibutuhkan.
        int alas, tinggi, luas;

        //Membuat input untuk user.
        JOptionPane.showMessageDialog(null, "Klik OK Untuk Melanjutkan!", "PROGRAM LUAS SEGITIGA",JOptionPane.INFORMATION_MESSAGE);
        alas = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Alas", "Silahkan Diisi",JOptionPane.INFORMATION_MESSAGE));
        tinggi = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Tinggi", "Silahkan Diisi",JOptionPane.INFORMATION_MESSAGE));

        //Membuat output yang akan ditampilkan.
        luas = alas*tinggi;
        JOptionPane.showMessageDialog(null, "Luas Segitiga "+luas, "HASIL",JOptionPane.INFORMATION_MESSAGE);
        input.close();
    }
}