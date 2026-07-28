public abstract class Car {
    private int year;
    private int mileage;

    public Car(int year, int mileage) {

        if (2026 - year > 20) {
            throw new IllegalArgumentException("Машина старше 20 лет!");
        }
        if (mileage > 10_000) {
            throw new IllegalArgumentException("Пробег больше 10 000 км!");
        }
        this.year = year;
        this.mileage = mileage;

    }

    public double calculateRentalCost(int hour) {
        int age = 2026 - year;
        double coefficient = getCoefficient();
        return ((10_000 - mileage) * (20 - age) * coefficient * hour) / 1000.0;
    }

    protected abstract int getCoefficient();

}