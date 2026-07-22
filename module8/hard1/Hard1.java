public class Hard1 {
    public static void main(String[] args) {
        Dealership dealer = new Dealership();

        Car car1 = new Car("Lada", "Granta", 2023, true, 750_000);
        Car car2 = new Car("Toyota", "Corolla", 2022, true, 1_800_000);
        Car car3 = new Car("Kia", "Rio", 2021, false, 950_000);
        Car car4 = new Car("BMW", "X5", 2024, true, 6_500_000);
        Car car5 = new Car("Hyundai", "Solaris", 2020, false, 700_000);
        Car car6 = new Car("Mercedes", "C-Class", 2023, true, 4_200_000);
        Car car7 = new Car("Renault", "Logan", 2019, false, 550_000);
        Car car8 = new Car("Audi", "A4", 2022, true, 3_100_000);
        Car car9 = new Car("Volkswagen", "Polo", 2021, true, 1_300_000);
        Car car10 = new Car("Ford", "Focus", 2018, false, 600_000);
        Car car11 = new Car("Mazda", "CX-5", 2023, true, 2_900_000);
        Car car12 = new Car("Nissan", "Qashqai", 2020, false, 1_100_000);
        Car car13 = new Car("Skoda", "Octavia", 2022, true, 1_900_000);
        Car car14 = new Car("Tesla", "Model 3", 2024, true, 5_800_000);
        Car car15 = new Car("Chevrolet", "Niva", 2021, false, 650_000);
        Car car16 = new Car("Volvo", "XC60", 2023, true, 4_700_000);
        Car car17 = new Car("ГАЗ", "Трактор МТЗ", 2020, false, 1_200_000); // сельхозтехника
        Car car18 = new Car("КамАЗ", "6520", 2022, true, 8_500_000);       // грузовик
        Car car19 = new Car("Lamborghini", "Huracan", 2024, true, 25_000_000);
        Car car20 = new Car("Fiat", "Ducato", 2019, false, 900_000);       // фургон

        // Добавляем все авто
        dealer.addVehicle(car1);
        dealer.addVehicle(car2);
        dealer.addVehicle(car3);
        dealer.addVehicle(car4);
        dealer.addVehicle(car5);
        dealer.addVehicle(car6);
        dealer.addVehicle(car7);
        dealer.addVehicle(car8);
        dealer.addVehicle(car9);
        dealer.addVehicle(car10);
        dealer.addVehicle(car11);
        dealer.addVehicle(car12);
        dealer.addVehicle(car13);
        dealer.addVehicle(car14);
        dealer.addVehicle(car15);
        dealer.addVehicle(car16);
        dealer.addVehicle(car17);
        dealer.addVehicle(car18);
        dealer.addVehicle(car19);
        dealer.addVehicle(car20);

        System.out.println("\n=== ВСЕ АВТОМОБИЛИ ===");
        dealer.showAllCar();

        System.out.println("\n=== САМЫЙ ДОРОГОЙ ===");
        dealer.mostExpensiveCar();

        System.out.println("\n=== САМЫЙ ДЕШЁВЫЙ ===");
        dealer.cheapestCar();

        System.out.println("\n=== СОРТИРОВКА ПО ЦЕНЕ ===");
        dealer.costSorted();

        System.out.println("\n=== ПРОДАЖА ===");
        dealer.sellCar("Toyota", "Corolla");
        dealer.sellCar("Lada", "Vesta"); // такой нет — проверка ошибки

        System.out.println("\n=== ПОСЛЕ ПРОДАЖ ===");
        dealer.cheapestCar(); // теперь самый дешёвый может измениться, если продали дешёвый
    }
}


