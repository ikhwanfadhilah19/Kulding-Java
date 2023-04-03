package AP1BLAST;

class Orang {
    String nama;
    String alamat;
    String no_telp;
}
class v4 {
    public static void main(String[] args) {
        Orang O = new Orang();

        O.nama = "Putri Mahadewi";
        O.alamat = "Jl. Pemuda 113 Magelang";
        O.no_telp = "0293-360345";

        System.out.println("=====================");
        System.out.println("NAMA = "+O.nama);
        System.out.println("ALAMAT = "+O.alamat);
        System.out.println("NO.TELP = "+O.no_telp);
    }
}