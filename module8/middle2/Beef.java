public class Beef extends Product{

    public Beef(String name, double volume){
        super(name, volume);
    }

    public Beef(double volume){
        this("Говядина", volume);
    }
}
