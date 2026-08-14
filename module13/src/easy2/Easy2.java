package easy2;

public class Easy2 {

    public static void main(String[] args) {
        System.out.println(sqrt(4));
        System.out.println(sqrt(-4));
    }

    private static double sqrt(int a) {
        if (a < 0) {
            throw  new IllegalArgumentException("Аргумент должен быть положительным");
        } else {
            return Math.sqrt(a);
        }
    }
}
