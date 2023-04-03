package LUAS;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Luas_Persegipanjang{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int panjang, lebar, luas;

        JOptionPane.showMessageDialog(null, "Klik OK Untuk Melanjutkan");
        panjang = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Panjang", "Silahkan Diisi", JOptionPane.INFORMATION_MESSAGE));
        lebar = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Lebar", "Silahkan Diisi", JOptionPane.INFORMATION_MESSAGE));

        luas = panjang*lebar;
        JOptionPane.showMessageDialog(null, "Luas Persegi Panjang "+luas, "HASIL", JOptionPane.INFORMATION_MESSAGE);
        input.close();
    }
}