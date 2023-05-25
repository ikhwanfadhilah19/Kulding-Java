package Lepkom;

//Maulana Rafiata_50421801

class MyClass {
    void tulis() {
        System.out.println("Tidak ada Parameter");
    }

    void tulis(double d) {
        System.out.println("Dengan satu Parameter Bernilai : " + d);
    }
}

class No9v2 {
    public static void main(String[] args) {
        MyClass c = new MyClass();
        c.tulis();
        c.tulis(8.5);
}
}