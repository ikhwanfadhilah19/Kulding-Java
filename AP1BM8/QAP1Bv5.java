package AP1BM8;
import java.util.Scanner;

public class QAP1Bv5 {//Ikhwan Fadhilah_51421603
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //do while loop
        String day[] = new String[7];
        int p = 0;
        System.out.println("Masukan 7 hari dalam seminggu: ");
        do{
            day[p] = input.nextLine();
            p++;
        }
        while ( p < day.length);
        input.close();
    }
}