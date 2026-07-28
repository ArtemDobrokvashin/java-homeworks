public class middle3 {
    public static void main(String[] args) {
        try {
            Bmw3 bmw = new Bmw3(2020, 5000);
            double cost = bmw.calculateRentalCost(2); // за 2 часа
            System.out.println("Аренда BMW3: " + cost + " руб.");

            Bmw3 bmwE46 = new Bmw3(1999, 250);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
