package AP1BM10;

import javax.swing.JOptionPane;

class Input{//Ikhwan Fadhilah_51421603
    void biodata(){
        String nama    = JOptionPane.showInputDialog("Masukkan Nama");
        String kelas   = JOptionPane.showInputDialog("Masukkan Kelas");
        String npm     = JOptionPane.showInputDialog("Masukkan NPM");
        String biodata = "Biodata Anda\nNama:"+nama+"\nKelas:"+kelas+"\nNPM:"+npm;
        JOptionPane.showMessageDialog(null, biodata);
    }
    void nilai(){
        String matkul = JOptionPane.showInputDialog("Masukan Nama Mata Kuliah Anda");
        String uas = JOptionPane.showInputDialog("Masukan Nilai UAS");
        int nilaiuas = Integer.parseInt(uas);
        String uts = JOptionPane.showInputDialog("Masukan Nilai UTS");
        int nilaiuts = Integer.parseInt(uts);
        int total = (nilaiuas + nilaiuts)/2;
        if (total >= 90)
        JOptionPane.showMessageDialog(null,"Nilai Anda\nMata Kuliah:"+matkul+"\nUAS:"+uas+"\nUTS:"+uts+"\nTotal:"+total+"\nNilai Anda A");
        else if (total >= 80)
        JOptionPane.showMessageDialog(null,"Nilai Anda\nMata Kuliah:"+matkul+"\nUAS:"+uas+"\nUTS:"+uts+"\nTotal:"+total+"\nNilai Anda B");
        else if (total >=70)
        JOptionPane.showMessageDialog(null,"Nilai Anda\nMata Kuliah:"+matkul+"\nUAS:"+uas+"\nUTS:"+uts+"\nTotal:"+total+"\nNilai Anda C");
        else if (total >= 60)
        JOptionPane.showMessageDialog(null,"Nilai Anda\nMata Kuliah:"+matkul+"\nUAS:"+uas+"\nUTS:"+uts+"\nTotal:"+total+"\nNilai Anda D");
        else
        JOptionPane.showMessageDialog(null,"Nilai Anda\nMata Kuliah:"+matkul+"\nUAS:"+uas+"\nUTS:"+uts+"\nTotal:"+total+"\nNilai Anda E, Anda Tidak Lulus!");
    }
}