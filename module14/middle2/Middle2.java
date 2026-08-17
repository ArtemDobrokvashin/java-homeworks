public class Middle2 {

    public static void main(String[] args) {
        Thread thread = new Thread(new DeamonTask());
        thread.setDaemon(true); //с демоном поток останавливается. Они нужны для фоновых задач (например, сборка мусора, логирование), которые не должны "держать" программу включённой
        thread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main stopped");
    }
}
