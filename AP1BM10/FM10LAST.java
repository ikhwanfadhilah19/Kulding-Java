package AP1BM10;

import javax.swing.JOptionPane;

public class FM10LAST {//Ikhwan Fadhilah_51421603
    public static void main(String[] args) {
        FM10LAST menuuu = new FM10LAST();
        menuuu.menu();
    }
    void menu(){
        int pil=0;
        JOptionPane.showMessageDialog(null, "HALO! Selamat datang di Menu BOT!\nKlik OK Untuk Melanjutkan:)");
        String menu =JOptionPane.showInputDialog("Silahkan Pilih Menu Dibawah: \n1.Biodata \n2.Nilai Mata Kuliah \n3.Jadwal Ujian \n4.Exit");
        pil = Integer.parseInt(menu);
        switch(pil){
            case 1:
                biodata();
                menu();
            break;
            case 2:
                nilai();
                menu();
            break;
            case 3:
                jadwal();
                menu();
            break;
            case 4:
                keluar();
            break;
            default:
            JOptionPane.showMessageDialog(null,"Mohonmaaf Anda Salah Memasukkan Input!");
        }
    }
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
    void jadwal() {
        String [] a =new String [6];
        a[0]="Senin";
        a[1]="Selasa";
        a[2]="Rabu";
        a[3]="Kamis";
        a[4]="Jumat";
        a[5]="Sabtu";
    do{
        String hari=JOptionPane.showInputDialog("Pilih Jadwal Praktikum:\n1.Senin\n2.Selasa\n3.Rabu\n4.Kamis\n5.Jumat\n6.Sabtu");
        int i=Integer.parseInt(hari);
        i=i-1;
        if (i==0){
        JOptionPane.showMessageDialog(null,"Anda Memilih Jadwal di Hari "+a[i],"HASIL",JOptionPane.INFORMATION_MESSAGE);
        }else if (i==1){
        JOptionPane.showMessageDialog(null,"Anda Memilih Jadwal di Hari "+a[i],"HASIL",JOptionPane.INFORMATION_MESSAGE);
        }else if (i==2){
        JOptionPane.showMessageDialog(null,"Anda Memilih Jadwal di Hari "+a[i],"HASIL",JOptionPane.INFORMATION_MESSAGE);
        }else if (i==3){
        JOptionPane.showMessageDialog(null,"Anda Memilih Jadwal di Hari "+a[i],"HASIL",JOptionPane.INFORMATION_MESSAGE);
        }else if (i==4){
        JOptionPane.showMessageDialog(null,"Anda Memilih Jadwal di Hari "+a[i],"HASIL",JOptionPane.INFORMATION_MESSAGE);
        }else if (i==5){
        JOptionPane.showMessageDialog(null,"Anda Memilih Jadwal di Hari "+a[i],"HASIL",JOptionPane.INFORMATION_MESSAGE);
        }else{
        JOptionPane.showMessageDialog(null,"Pilihan Anda Tidak Dimengerti! ","PERINGATAN",JOptionPane.ERROR_MESSAGE);
        System.exit(0);
        }
    }
    while(JOptionPane.showConfirmDialog(null,"Ingin Mengubah Jadwal?")==JOptionPane.YES_OPTION);
    }
    void keluar(){
        if (JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Keluar?","Pilihan",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_OPTION){
            System.exit(0);
        }else{
            menu();
        }
    }
}