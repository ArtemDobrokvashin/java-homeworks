public class Hard1 {

    public static void main(String[] args) {
        System.out.println("Старт главного потока");
        MyTrhread task = new MyTrhread();
        Thread t = new Thread(task);
        System.out.println("Состояние потока до t.start() " + t.getState());
        t.start();
        System.out.println("Состояние потока после t.start() " + t.getState());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Состояние во время работы " + t.getState());
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("После завершения " + t.getState());
        System.out.println("Окончание работы главного потока");
    }
}
