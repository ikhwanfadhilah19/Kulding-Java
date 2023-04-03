package Random;

import javax.swing.JOptionPane;

public class F10 {
        public static void main(String[] args) {
            int a=1;
            int c=20;
            String ulang;
            do{
String menu= JOptionPane.showInputDialog(null,"Masukkan Pilihan Anda ;\n 1. Menghitung Deret 1,3,5,7,9,11\n 2. Menampilkan deret urutan terbalik\n 3. keluar");
            int option = Integer.parseInt(menu);
            if(option==1){
                        do{
                        System.out.print(a+",");
                        a=a+2; }
                        while (a<=11);  } 
            else if(option==2){
                        do{
                        System.out.print(c+",");
                        c=c-2;  }
                        while(c>=1); }
            else if(option==3){
                        JOptionPane.showMessageDialog(null,"Terima Kasih Atas Kunjungan Anda");
                        System.exit(0);            }
            ulang = JOptionPane.showInputDialog(null,"Apakah anda ingin mengulang\n 1.ya\n 2.tidak");
            }
                        while("1".equals(ulang));
            JOptionPane.showMessageDialog(null,"Terima Kasih atas kunjungannya....!!!!:):)");
           
            System.out.println("Hello World!");
    }
}
