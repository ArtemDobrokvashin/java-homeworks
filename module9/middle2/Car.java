package module9.middle2;

import java.util.Objects;

public class Car {
    private String nameCar;
    private String licensePlate;

    public Car(String nameCar, String licensePlate){
        this.nameCar = nameCar;
        this.licensePlate = licensePlate;
    }

    public String getNameCar() {
        return nameCar;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car that = (Car) obj;
        return Objects.equals(this.licensePlate, that.licensePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(licensePlate);
    }
}
