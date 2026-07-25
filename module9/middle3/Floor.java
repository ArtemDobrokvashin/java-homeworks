package module9.middle3;

public class Floor {
    private int floor;
    private int maxFloor = 5;


    public Floor(int floor) {
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        if (floor < 0 || floor > maxFloor) {
            System.out.println("Этаж " + floor + " вне диапазона");
            return;
        }
        this.floor = floor;
    }

}
