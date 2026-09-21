package easy2;

public class AnonymousClass {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Printable");
            }
        };
    }
}
