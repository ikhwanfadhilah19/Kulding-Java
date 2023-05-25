//Ikhwan Fadhilah_51421603

public class ACT4 {
    private String myname;
    private String mynpm;
    private String myclass;
    private String mygender;

    public void setmyname(String myname) {
        this.myname = myname;
    }

    public String getmyname() {
        return myname;
    }

    public void setmynpm(String mynpm) {
        this.mynpm = mynpm;
    }

    public String getmynpm() {
        return mynpm;
    }

    public void setmyclass(String myclass) {
        this.myclass = myclass;
    }

    public String getmyclass() {
        return myclass;
    }

    public void setmygender(String mygender) {
        this.mygender = mygender;
    }

    public String getmygender() {
        return mygender;
    }

    public static void main(String[] args) {
        ACT4 act4 = new ACT4();
        act4.setmyname("Ikhwan Fadhilah");
        act4.setmynpm("51421603");
        act4.setmyclass("2IA26");
        act4.setmygender("Laki Laki");

        System.out.println("Nama : " + act4.getmyname());
        System.out.println("NPM : " + act4.getmynpm());
        System.out.println("Kelas : " + act4.getmyclass());
        System.out.println("Jenis Kelamin : " + act4.getmygender());
    }
}