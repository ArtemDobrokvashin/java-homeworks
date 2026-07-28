public class Audi extends Car{
    public Audi(int year, int mileage){
        super(year,mileage);
    }

    @Override
    protected int getCoefficient() {
        return 5;
    }
}
