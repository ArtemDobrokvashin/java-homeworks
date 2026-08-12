import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Hard1 {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("journal.txt")) {
            Hero hero = new Hero("Васечкин", pw);
            hero.go("Кино");
            hero.eat("Бургер");
            hero.talk("Маша");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
