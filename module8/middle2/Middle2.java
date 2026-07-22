public class Middle2 {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        fridge.putOnFridge(new Bread(10.0));
        fridge.putOnFridge(new Sausage(25.0));
        fridge.putOnFridge(new Cheese(15.0));
        fridge.putOnFridge(new Butter(20.0));
        fridge.putOnFridge(new Vodka(0.75));
        fridge.putOnFridge(new Apple(3.75));
        fridge.putOnFridge(new Beef(3.75));
        fridge.putOnFridge(new Beef(22.75));

        fridge.printContents();
    }
}
