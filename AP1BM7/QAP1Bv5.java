package AP1BM7;

public class QAP1Bv5 {
    public static void main(String[] args) {
        String names[] = {"Beah","Bianca","Lance","Beah"};
        int count = 0;
        for (int i=0; i<names.length; i++){
            if(!names[i].equals("Beah")){
                continue;
            }
            count++;
        }
        System.out.println("There are " + count + " Beahs in the list");
    }
}