public class Bread extends Product {

    public Bread(String name, double volume){
        super(name, volume);
    }

    public Bread(double volume) {
        this("хлеб", volume);
    }
}
