public class Middle1 {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        t1.start();
        /*
        Thread-0 - имя потока,
        5 - приоритет потока,
        main - группа потоков запущенная из main
        */
    }
}
