package middle2;

import java.util.ArrayList;
import java.util.List;

public class Middle2 {

    public static void main(String[] args) {

        recourse();
        try {
            outOfMemory();
        } catch (Error e) {
            System.out.println("Перехват Error: " + e.getClass().getSimpleName());
            //Перехватывать Error не стоит, потому что он сигнализирует о фатальной ошибке виртуальной машины, после которой состояние программы непредсказуемо
        }
    }

    public static void recourse(){
        recourse();
    }

    public static void outOfMemory(){
        List<int[]> list = new ArrayList<int[]>();
        while (true){
            int[] bigInt  = new int[100_000_000];
            list.add(bigInt);
        }

    }


}
