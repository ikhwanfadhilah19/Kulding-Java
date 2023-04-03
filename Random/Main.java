package Random;

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("|      LOGIN PTA      |");
        System.out.println("=======================");
        System.out.print("Masukan Username: ");
        String user = input.next();
 
        System.out.print("Masukan Password: ");
        String pwd = input.next();
        System.out.println("-----------------------");
        if (user.equals("admin") && pwd.equals("*****"))
        {
            System.out.println("");
            System.out.println("  Anda berhasil login!  ");
            System.out.println("");
            }
        else
        {
            System.out.println("");
            System.out.println("  Silahkan coba kembali!  ");
            System.out.println("");
        }input.close();
    }
}