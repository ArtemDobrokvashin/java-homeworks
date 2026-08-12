import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Easy2 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("test.txt");
        LocalDateTime date = LocalDateTime.now();
        PrintWriter pw = new PrintWriter(file);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("(╯°□°）╯ HH:mm dd.MM.yyyy ノ( º _ ºノ)");

        pw.write(date.format(dtf));

        pw.close();


    }
}
