package AP1BM11;

class CetakDataTipe {
    public void CetakData(String Cetak) {
        System.out.println(Cetak);
    }
    public void CetakData(int Cetak) {
        System.out.println(Cetak);
    }
}
    
public class M11v3 {
    public static void main(String[] args) {
        CetakDataTipe data = new CetakDataTipe();
        System.out.print("Nama          : ");
        data.CetakData("Ikhwan Fadhilah");

        System.out.print("Asal Kota     : ");
        data.CetakData("Sumatra");
        
        System.out.print("Umur          : ");
        data.CetakData(18);

        System.out.print("Tahun Lahir   : ");
        data.CetakData(2003);
    }
}