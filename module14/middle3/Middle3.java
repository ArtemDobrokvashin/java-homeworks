public class Middle3 {

    public static void main(String[] args) {
        Thread thread = new Thread(new DeamonTask());
        thread.setName("NewThreadName"); //задали имя и убрали setDaemon
        thread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main stopped");
    }
}
