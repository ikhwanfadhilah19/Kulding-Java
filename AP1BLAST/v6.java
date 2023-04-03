package AP1BLAST;

class v6 {
    String nama;
    int umur;
    
    void Person(String n, int a){
        nama = n;
        umur = a;
    }

    void printPerson(){
        System.out.println("Hallo... Aku " + nama);
        System.out.println("Aku " + umur + " tahun");
    }

    public static void main(String[] args){
    v6 p = new v6();
    p.Person("Ikhwan Fadhilah", 18);
    System.out.println("------------------------");
    p.printPerson();
    System.out.println("------------------------");
    }
}