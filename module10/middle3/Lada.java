public class Lada extends Car{
    public Lada(int year, int mileage){
        super(year,mileage);
    }
    @Override
    protected int getCoefficient() {
        return 1;
    }
}
