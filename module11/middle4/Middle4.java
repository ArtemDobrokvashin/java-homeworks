import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Middle4 {

    public static void main(String[] args) {
        System.out.println("Введите название стран. Для завершения, нажмите Enter");
        Scanner sc = new Scanner(System.in);
        TreeSet<String> countryList = new TreeSet<String>();
        while (true) {
            System.out.print("Страна: ");
            String country = sc.nextLine().toLowerCase();
            if (!country.isEmpty()){
                countryList.add(capitalize(country));


            } else  {
                break;
            }
        }

        ArrayList<String> sortedCountryList = new ArrayList<>(countryList);
        if (sortedCountryList.contains("Греция")){
            sortedCountryList.remove("Греция");
            sortedCountryList.add(0, "Греция");
        }

        System.out.println(sortedCountryList);

    }
    public static String capitalize(String s) {
        if (s == null || s.isEmpty()) return s;
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
}

