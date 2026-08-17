public class DeamonTask implements Runnable{
    private static int count = 0;

    @Override
    public void run() {
        System.out.println("start");

        while (true) {
            try {
                Thread.sleep(1000);   //засыпание потока на 1 секунду
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(++count);
        }
    }
}
