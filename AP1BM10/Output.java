package AP1BM10;

import javax.swing.JOptionPane;

class Output extends Input{//Ikhwan Fadhilah_51421603
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
        }
        else{
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
            JOptionPane.showMessageDialog(null, "GoodBye!");
        }
    }
}