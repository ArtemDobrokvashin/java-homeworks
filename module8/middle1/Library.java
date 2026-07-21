package middle1;

import java.util.ArrayList;

public class Library {

    private ArrayList<LibraryItem> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void add(LibraryItem item) {
        items.add(item);
        System.out.println("Обновление в библиотеке: " + item.getTitle());
    }

    public boolean isAvailable(LibraryItem item) {
        if (item.isAvailable()) {
            System.out.println(item.getTitle() + " " + item.getAuthor() + " " + " есть в наличии");
            return true;
        } else {
            System.out.println(item.getTitle() + " " + item.getAuthor() + " " + " сейчас нет");
            return false;
        }
    }

    public void checkOutItem(LibraryItem item) {
        if (items.contains(item)){
            LibraryItem realItem = items.get(items.indexOf(item));
            if (realItem.isAvailable()){
                realItem.setAvailable(false);
                System.out.println("Выдано " + realItem.getTitle() + " " + realItem.getAuthor());
            } else {
                System.out.println(realItem.getTitle() + " " + realItem.getAuthor() + " Уже выдано");
            }
        } else {
            System.out.println("Такого " + item.getAuthor() + " " + item.getTitle() + " в библиотеке нет");
        }
    }

    public int getTotalCount() {
        return items.size();
    }

    public int getAvailableCount() {
        int count = 0;
        for (LibraryItem item : items) {
            if (item.isAvailable()) {
                count++;
            }
        }
        return count;
    }

    public void printInventory() {
        System.out.println("Всего материалов: " + getTotalCount());
        System.out.println("Доступно: " + getAvailableCount());
        System.out.println("Список:");
        for (LibraryItem item : items) {
            String status = item.isAvailable() ? "в наличии" : "выдан";
            System.out.println("- " + item.getTitle() + " (" + item.getAuthor() + ") — " + status);
        }
    }
}

