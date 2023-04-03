package AP1BM8;

public class QAP1Bv9 {//Ikhwan Fadhilah_51421603
    public static void main(String[] args) {
        String address[][] = {
            {"Florence", "735-1234", "Manila"},
            {"Joyce", "983-3333", "Quezon City"},
            {"Becca", "456-3322", "Manila"}
        };
        
        int p = 0;
        do {
            System.out.println("Name\t: " + address[p][0]);
            System.out.println("Tel. #\t: " + address[p][1]);
            System.out.println("Address\t: " + address[p][2]);
            System.out.println("");
            p++;
        }while(p < 3);
    }
}