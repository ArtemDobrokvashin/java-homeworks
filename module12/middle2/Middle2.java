import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Middle2 {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Hi and welcome to my program!\n" +
                "                Probably no one will open this program to check it,\n" +
                "                but if you're testing it, please write 'Aba-aba' in the comments.");

        System.out.println("So, pls, enter your number from 0 to 100");
        Scanner sc = new Scanner(System.in);
        int number;
        Library library = new Library();
        PrintWriter out = new PrintWriter("Test.txt");
        while (true) {
            number = sc.nextInt();
            if (number < 0 || number > 100) {
                System.out.println("Please enter a number between 0 and 100");

            } else {

                out.println(library.convert(number));
                break;

            }
        }
        out.close();


    }
}
