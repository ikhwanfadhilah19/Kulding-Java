package AP1BM10;

import javax.swing.JOptionPane;

public class FM10 {//Ikhwan Fadhilah_51421603
    public static void main(String[] args) {
        FM10 menuu = new FM10();
        menuu.menu();
    }
    void menu(){
        Output objek = new Output();
        int pil=0;
        JOptionPane.showMessageDialog(null, "HALO! Bersama Saya Dengan Bot MENU.\nKlik OK Untuk Melanjutkan!");
        String menu =JOptionPane.showInputDialog("Silahkan Pilih Menu Dibawah: \n1.Biodata \n2.Nilai Mata Kuliah \n3.Jadwal Ujian \n4.Exit");
        pil = Integer.parseInt(menu);
        switch(pil){
            case 1:
            objek.biodata();
            menu();
            break;
            case 2:
            objek.nilai();
            menu();
            break;
            case 3:
            objek.jadwal();
            menu();
            break;
            case 4:
            objek.keluar();
            break;
            default:
            JOptionPane.showMessageDialog(null,"Mohonmaaf Anda Salah Memasukkan Input!");
        }
    }
}