package AP1BM8;
import java.util.Scanner;

public class QAP1Bv6 {//Ikhwan Fadhilah_51421603
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //for loop
        String[] day = new String[7];
        System.out.println("Masukan 7 hari dalam seminggu: ");

        for ( int p=0; p < day.length; p++) {
            day[p] = input.nextLine();
        }
        input.close();
    }
}