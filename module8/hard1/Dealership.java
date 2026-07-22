import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Dealership {
    private List<Car> carList = new ArrayList<>();


    public void addVehicle(Car v) {
        carList.add(v);
        System.out.println("Поступил новый автомобиль " + v.getBrand() + " " + v.getModel());
    }

    public void sellCar(String brand, String model) {
        boolean flag = false;
        for (Car car : carList) {
            if ((car.getBrand().equals(brand) && car.getModel().equals(model)) && car.isAvailable()) {
                car.setAvailable(false); // ← чётко: делаем недоступным
                System.out.println("Авто " + car.getBrand() + " " + car.getModel() + " продан");
                flag = true;
                break;
            }

        }
        if (!flag) {
            System.out.println("Такого авто нет в наличии");
        }
    }

    public void showAllCar() {
        if (carList.isEmpty()) {
            System.out.println("Нет автомобилей");
            return;
        }

        System.out.println("Сейчас в наличии есть:");

        for (Car car : carList) {
            System.out.println(car.getBrand() + " " + car.getModel());
        }
    }

    public void mostExpensiveCar() {
        if (carList.isEmpty()) {
            System.out.println("Нет автомобилей");
            return;
        }
        Car mostExpensive = null;
        for (Car car : carList) {
            if (mostExpensive == null || car.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = car;
            }
        }
        System.out.println("Самый дорогой авто " + mostExpensive.getModel() + " " + mostExpensive.getBrand() + ". Цена авто: " + (long)mostExpensive.getPrice());

    }

    public void cheapestCar() {
        if (carList.isEmpty()) {
            System.out.println("Нет автомобилей");
            return;
        }

        Car cheapCar = null;
        for (Car car : carList) {
            if (cheapCar == null || car.getPrice() < cheapCar.getPrice()) {
                cheapCar = car;
            }
        }
        System.out.println("Самый дешевый авто " + cheapCar.getBrand() + " " + cheapCar.getModel() + ". Его стоймость: " + (long)cheapCar.getPrice());
    }

    public void costSorted() {
        if (carList.isEmpty()) {
            System.out.println("Нет автомобилей");
            return;
        }

        List<Car> costSortedList = new ArrayList<>(carList);
        costSortedList.sort(Comparator.comparing(Car::getPrice));
        System.out.println("Автомобили по возрастанию цены:");
        for (Car car : costSortedList) {
            System.out.println(car.getBrand() + " " + car.getModel() + " — " + (long)car.getPrice());
        }
    }


}
