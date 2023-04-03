package AP1BM13;

public class Main {//Ikhwan Fadhilah_51421603   
    String pesan = "Hallo my name is ikhwan";
    Integer level = 100;
    Boolean benar = true;
    Character oke = 'o';

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main instanceof Main);

        System.out.println(main.pesan instanceof String);
        System.out.println(main.level instanceof Integer);
        System.out.println(main.benar instanceof Boolean);
        System.out.println(main.oke instanceof Character);
    }
}
