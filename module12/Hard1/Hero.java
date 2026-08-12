
import java.io.PrintWriter;


public class Hero {
    private String name;
    private PrintWriter journal;


    public Hero(String name,  PrintWriter journal) {
        this.name = name;
        this.journal = journal;
    }

    public String getName() {
        return name;
    }



    public void go(String to){
        journal.println("Был там: " + to);
    }

    public void eat(String meal){
        journal.println("Что ел: " + meal);
    }

    public void talk(String dialog){
        journal.println("Говорил с " + dialog);
    }

}
