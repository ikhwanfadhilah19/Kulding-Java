package AP1BM8;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class QAP1Bv7 {//Ikhwan Fadhilah_51421603
    public static void main(String[] args) {
        BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));

        int[] p = new int[11];
        int terbesar = 0;
        for(int q=1;q+1<=p.length;q++)
        {
            System.out.print("Masukan angka "+q+" :");
            try
            {
                p[q] = Integer.parseInt(masuk.readLine());
            }
            catch( IOException e) { 
            }
            if(terbesar>p[q]) {      
                if(terbesar>p[q]){
                }                
            }
            else {     
                if(p[q]>p[q-1]) {
                    terbesar=p[q];
                }else{
                    terbesar=p[q-1];
                }
            }
        }
        String hasil="Hasil terbesar adalah "+terbesar;
        System.out.println(hasil);
    }
}