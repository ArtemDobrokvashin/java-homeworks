package module9.middle3;

import java.util.ArrayList;
import java.util.Scanner;

public class Elevator {
    private ArrayList<Cargo> cargos;
    double totalWeight = 500;
    private Floor currentFloor = new Floor(1);

    public Elevator() {
        cargos = new ArrayList<>();
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public double getCurrentWeight() {
        return cargos.stream().mapToDouble(Cargo::getWeight).sum();
    }

    public void addCargo(Cargo cargo) {
        cargos.add(cargo);
        double tempWeight = getCurrentWeight();
        if (tempWeight > totalWeight) {
            System.out.println("Лифт никуда не поедет. Перегруз " + (tempWeight - totalWeight) + " кг.");
        } else {
            System.out.println("Груз добавлен. Можете указать нужный этаж");
        }
    }

    public void removeCargo(Cargo cargo) {
        boolean removes = cargos.remove(cargo);
        if (removes) {
            System.out.println("Груз убрали из лифта");
        } else {
            System.out.println("Такого груза нет");
        }
    }

    public int pushCargo() {
        if (getCurrentWeight() > totalWeight) {
            double overload = getCurrentWeight() - totalWeight;
            System.out.println("Лифт перегружен на " + overload + " кг. Сначала удалите лишний груз.");
            return currentFloor.getFloor(); // остаёмся на текущем этаже
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите номер этажа");
            int numOfFloor = sc.nextInt();
            currentFloor.setFloor(numOfFloor);
            return currentFloor.getFloor();
        }
    }


}