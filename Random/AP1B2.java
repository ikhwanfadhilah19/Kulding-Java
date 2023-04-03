package Random;

import javax.swing.JOptionPane;

public class AP1B2 {
    public static void main(String[] args) {
        
        int nilai1,nilai2,nilai3,hasil;

        nilai1=Integer.parseInt(JOptionPane.showInputDialog("Masukan Nilai Pertama Anda :"));
        nilai2=Integer.parseInt(JOptionPane.showInputDialog("Masukan Nilai Kedua Anda   :"));
        nilai3=Integer.parseInt(JOptionPane.showInputDialog("Masukan Nilai Ketiga Anda  :"));
        hasil=(nilai1+nilai2+nilai3)/3;

        if (hasil >=60){
            JOptionPane.showMessageDialog(null,"Nilai Anda Adalah " +hasil+" :)");            
        }
        else{
            JOptionPane.showMessageDialog(null,"Maaf Anda Tidak Lulus");
        }
    }
}