public class Main {
    public static void main(String[] args){
        Cat[] cats = {new Cat("cat1",50), new Cat("cat2", 45), new Cat("cat3", 30), new Cat("cat4", 20), new Cat("cat5", 10)};


    Tarelka tarelka = new Tarelka(40);
    for(Cat cat : cats){
        cat.eda(tarelka);
        cat.info();
    }
}
}
