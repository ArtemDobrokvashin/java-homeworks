
package module9.middle2;

import java.util.ArrayList;

public class Parking {
    private ArrayList<Car> cars;
    private final int parkingSpace = 20;

    public Parking() {
        cars = new ArrayList<>();
    }

    public void putOnParking(Car car) {

        if (cars.size() < parkingSpace) {
            System.out.println("Автомобиль " + car.getNameCar() + " с гос номером " + car.getLicensePlate() + " припаркован");
            cars.add(car);
        } else {
            System.out.println("Мест нет");
        }

    }

    public void checkOutCar(String licensePlate) {
        Car searchCar = new Car("", licensePlate);
        boolean success = cars.remove(searchCar);
        if (success) {
            System.out.println("Авто с гос номером " + searchCar.getLicensePlate() + " уехало");
        } else {
            System.out.println("Авто с гос номером " + searchCar.getLicensePlate() + " не найдено");
        }

    }

    public boolean isFull(){
        return cars.size() > parkingSpace;
    }

    public void showParking(){
        System.out.println("Сейчас припаркованы следующие авто:");
        for (Car c : cars){
            System.out.println(c.getNameCar() + " " + c.getLicensePlate());
        }
    }
}
