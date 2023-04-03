package Project;

import javax.swing.JOptionPane;

public class HukumOhm {//Ikhwan Fadhilah_1IA26_51421603
    public static void main(String[] args) {
        HukumOhm menu = new HukumOhm();
        JOptionPane.showMessageDialog(null, "Selamat Datang di Program Hukum Ohm Fisika,\nKlik OK Untuk Melanjutkan.", "Welcome", JOptionPane.INFORMATION_MESSAGE);
        menu.menu_utama();
    }

    //Program untuk menu utama
    void menu_utama() {
        int pilih;

        String menu_utama = JOptionPane.showInputDialog(null, "Pilih Menu Dibawah Ini:\n1. Menghitung Kuat Arus Listrik\n2. Menghitung Tegangan Listrik\n3. Menghitung Hambatan Listrik\n4. Keluar");
        pilih = Integer.parseInt(menu_utama);

        switch(pilih){
            case 1:
                kuat_arus();
                menu_utama();
            break;
            case 2:
                tegangan();
                menu_utama();
            break;
            case 3:
                hambatan();
                menu_utama();
            break;
            case 4:
                keluar();
                menu_utama();
            break;
            default:
            JOptionPane.showMessageDialog(null, "Mohonmaaf Pilihan Anda Tidak Tersedia, Silahkan Coba Lagi!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            menu_utama();
        }
    }

    //Program untuk mencari nilai kuat arus listrik
    void kuat_arus() {
        //Untuk menginput nilai tegangan
        String niltegangan = JOptionPane.showInputDialog(null, "Masukkan Nilai Tegangan");
        double V = Double.parseDouble(niltegangan);

        //Untuk menginput nilai hambatan
        String nilhambatan = JOptionPane.showInputDialog(null, "Masukkan Nilai Hambatan");
        double R = Double.parseDouble(nilhambatan);

        //Hasil dari nilai kuat arus
        String I = "Hasil dari Nilai Kuat Arus adalah " + V / R + " Ampere";
        JOptionPane.showMessageDialog(null, I);
    }

    //Program untuk mencari nilai tegangan listrik
    void tegangan() {
        //Untuk menginput nilai kuat arus
        String nilkuatarus = JOptionPane.showInputDialog(null, "Masukkan Nilai Kuat Arus");
        double I = Double.parseDouble(nilkuatarus);

        //Untuk menginput nilai hambatan
        String nilhambatan = JOptionPane.showInputDialog(null, "Masukkan Nilai Hambatan");
        double R = Double.parseDouble(nilhambatan);

        //Hasil dari nilai tegangan listrik
        String V = "Hasil dari Nilai Tegangan Listrik adalah " + I * R + " Volt";
        JOptionPane.showMessageDialog(null, V);
    }

    //Program untuk mencari nilai hambatan listrik
    void hambatan() {
        //Untuk menginput nilai tegangan
        String niltegangan = JOptionPane.showInputDialog(null, "Masukkan Nilai Tegangan");
        double V = Double.parseDouble(niltegangan);

        //Untuk menginput nilai kuat arus
        String nilkuatarus = JOptionPane.showInputDialog(null, "Masukkan Nilai Kuat Arus");
        double I = Double.parseDouble(nilkuatarus);

        //Hasil dari nilai hambatan
        String R = "Hasil dari Nilai Hambatan adalah " + V / I + " Ohm";
        JOptionPane.showMessageDialog(null, R);
    }

    //Program untuk keluar
    void keluar() {
        if(JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Keluar?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_OPTION){
        System.exit(0);
        }else {
            menu_utama();
        }
    }
}       