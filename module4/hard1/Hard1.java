package module4.hard1;

import hard1.Circle;
import hard1.Rectangle;
import hard1.Shape;
import hard1.Triangle;

import java.util.Scanner;

public class Hard1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип фигуры:" + "\n" + "1. Круг" + "\n" + "2. Прямоугольник" + "\n" + "3. Треугольник");
        int userChoose = scanner.nextInt();

        Shape shape = null;

        if (userChoose == 1){
            System.out.println("Введите радиус круга");
            shape = new Circle(scanner.nextDouble());
        }
        else if (userChoose == 2){
            System.out.println("Введите длинны сторон");
            shape = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
        }
        else if (userChoose == 3) {
            System.out.println("Введите длинны 3 сторон");
            shape = new Triangle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        }

        if (shape != null) {
            System.out.println("Площадь: " + shape.getArea());
        } else {
            System.out.println("Неверный выбор");
        }
    }
}
