public class Cat {
    private String name;
    private int apetit;
    private boolean golod;

    Cat(String name, int apetit){
        this.name=name;
        this.apetit= apetit;
        this.golod= true;
    }
    void info() {
        String golod1 = !golod ? "сыт" : "голоден";
        System.out.println(name + golod1);
    }
    void eda(Tarelka tarelka){
        if (golod && tarelka.eda1(apetit))
            golod = false;
    }
}
