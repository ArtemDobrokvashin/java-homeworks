public class Vodka extends Product{

    public Vodka(String name, double volume){
        super(name, volume);
    }

    public Vodka(double volume){
        this("Водка",volume);
    }
}
