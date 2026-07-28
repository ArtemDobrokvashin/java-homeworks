public class Bmw3 extends Car{

    public Bmw3(int year, int mileage){
        super(year,mileage);
    }

    @Override
    protected int getCoefficient() {
        return 7;
    }
}
