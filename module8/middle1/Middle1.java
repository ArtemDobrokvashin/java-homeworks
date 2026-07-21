package middle1;

public class Middle1 {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.add(new Book("Роулинг", "Гарри Поттер", "HP001"));
        System.out.println("Всего: " + lib.getTotalCount());
        System.out.println("Доступно: " + lib.getAvailableCount());
    }
}
