package middle1;

public class RecursionExample {
    private int number;

    public RecursionExample(int number) {
        this.number = number;
    }

    public void printNumber(int startNum, int number) {
        if (startNum > number) {
            return;
        }
        System.out.print(startNum + " ");
        printNumber(startNum + 1, number);
    }

}
