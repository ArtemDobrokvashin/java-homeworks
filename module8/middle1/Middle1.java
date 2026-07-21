
public class Middle1 {
    public static void main(String[] args) {
        Library lib = new Library();

        System.out.println("=== 📚 Добавляем разные материалы ===");
        lib.add(new Book("Роулинг", "Гарри Поттер", "BOOK-001"));
        lib.add(new Magazine("National Geographic", "Мир животных", "MAG-2024"));
        lib.add(new Newspaper("Комсомольская правда", "Выпуск от 22 июля", "NEWS-20240722"));
        lib.add(new ScientificPaper("Эйнштейн", "Теория относительности", "PAPER-1905"));

        System.out.println("Всего материалов: " + lib.getTotalCount());
        System.out.println("Доступно сейчас: " + lib.getAvailableCount());

        System.out.println("\n=== 🔍 Проверяем наличие каждого ===");
        lib.isAvailable(new Book("Роулинг", "Гарри Поттер", "BOOK-001"));
        lib.isAvailable(new Magazine("National Geographic", "Мир животных", "MAG-2024"));

        System.out.println("\n=== 📤 Выдаём книги и журнал ===");
        lib.checkOutItem(new Book("Роулинг", "Гарри Поттер", "BOOK-001"));
        lib.checkOutItem(new Magazine("National Geographic", "Мир животных", "MAG-2024"));

        System.out.println("После выдачи — доступно: " + lib.getAvailableCount());

        System.out.println("\n=== 🔄 Возвращаем книгу ===");
        lib.returnItem(new Book("Роулинг", "Гарри Поттер", "BOOK-001"));
        System.out.println("После возврата — доступно: " + lib.getAvailableCount());

        System.out.println("\n=== ❌ Пытаемся выдать несуществующий материал ===");
        lib.checkOutItem(new Book("Неизвестный", "Фантастическая книга", "FAKE-999"));

        System.out.println("\n=== 🧪 Пытаемся выдать уже выданный журнал ===");
        lib.checkOutItem(new Magazine("National Geographic", "Мир животных", "MAG-2024"));

        System.out.println("\n=== 📰 Работа с газетой (обычно одноразовая) ===");
        lib.checkOutItem(new Newspaper("Комсомольская правда", "Выпуск от 22 июля", "NEWS-20240722"));
        System.out.println("Газета выдана. Доступно: " + lib.getAvailableCount());

        System.out.println("\n=== 🧠 Научная работа — редкий запрос ===");
        lib.isAvailable(new ScientificPaper("Эйнштейн", "Теория относительности", "PAPER-1905"));
        lib.checkOutItem(new ScientificPaper("Эйнштейн", "Теория относительности", "PAPER-1905"));

        System.out.println("\n=== 📊 Финальный отчёт ===");
        System.out.println("ВСЕГО МАТЕРИАЛОВ: " + lib.getTotalCount());
        System.out.println("ДОСТУПНО СЕЙЧАС: " + lib.getAvailableCount());
        System.out.println("\n✅ Тестирование завершено!");
    }
}