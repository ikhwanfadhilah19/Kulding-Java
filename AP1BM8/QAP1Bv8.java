package AP1BM8;
import javax.swing.JOptionPane;

public class QAP1Bv8 {//Ikhwan Fadhilah_51421603
    public static void main(String[] args) {
        int[] p = new int[11];
        String[] r = new String[11];
        int terbesar = 0;

        for(int q=1;q+1<=p.length;q++) {
            System.out.println(q); 
            r[q] = JOptionPane.showInputDialog("Masukkan angka ke-"+q+" :");
            p[q] = Integer.parseInt(r[q]);

            if(terbesar>p[q]) {
                if(terbesar>p[q]) {
                    System.out.println(terbesar);
                }
            }else {
                if(p[q]>p[q-1]) {
                    terbesar=p[q];
                }else {
                    terbesar=p[q-1];
                }
                System.out.println(terbesar);
            }
        }
        String hasil="Hasil terbesar adalah "+terbesar;
        JOptionPane.showMessageDialog(null, hasil);
    }
}
