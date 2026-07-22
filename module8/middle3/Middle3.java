public class Middle3 {
    public static void main(String[] args) {


        WorkoutCalculator calc = new WorkoutCalculator();
        double result = calc.calculate(new Running(), 20); // бег 20 минут
        System.out.println("Сожжено: " + result + " ккал");
    }
}
