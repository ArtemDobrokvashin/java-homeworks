public class Cheese extends Product{

    public Cheese(String name, double volume){
        super(name, volume);
    }

    public Cheese(double volume){
        this("Сыр", volume);
    }
}
