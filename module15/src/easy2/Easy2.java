package easy2;

public class Easy2 {

    public static void main(String[] args) {
        Long startTime = System.currentTimeMillis();
        int[] array = new int[]{5, 7, 2, 4, 9, 1, 3, 7, 5, 99, 2, 9, 0, 10, 15, 22, 12, 44, 11, 83, 33, 6, 18, 27, 41, 3, 19, 55, 8, 14, 29, 37, 48, 50, 62, 71, 88, 92, 30, 45, 53, 66, 77, 81, 90, 13, 25, 39, 60, 75
        };
        bubbleSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
        long endTime = System.currentTimeMillis();
        System.out.println();
        System.out.println("Время выполнения сортировки в мс: " + (endTime - startTime));
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

}

