package module9.middle3;

public class Middle3 {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        Cargo c1 = new Cargo(15, "Мешок");
        Cargo c2 = new Cargo(156, "комод");
        Cargo c3 = new Cargo(300, "Пианино");
        Cargo c4 = new Cargo(55, "Чей-то ребенок");
        elevator.addCargo(c1);
        elevator.pushCargo();
        elevator.addCargo(c2);
        elevator.addCargo(c3);
        elevator.addCargo(c4);
        elevator.pushCargo();
        elevator.pushCargo();
        elevator.removeCargo(c1);
        elevator.removeCargo(c2);
        elevator.pushCargo();

    }
}
