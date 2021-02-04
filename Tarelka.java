public class Tarelka {
    public int eda;
    public Tarelka(int eda) {
        this.eda=eda;
    }
    boolean eda1(int a){
        int b = eda - a;
        if (b < 0) return false;
        eda = a;
        return  true;

    }
    void eda2(int eda){
        this.eda=eda;
    }
    void info() {
        System.out.println("tarelka" + eda);
    }

}
