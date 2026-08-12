public class Library {
    private String[] firstNumbers = {"ноль",
            "один",
            "два",
            "три",
            "четыре",
            "пять",
            "шесть",
            "семь",
            "восемь",
            "девять",
            "десять",
            "одиннадцать",
            "двенадцать",
            "тринадцать",
            "четырнадцать",
            "пятнадцать",
            "шестнадцать",
            "семнадцать",
            "восемнадцать",
            "девятнадцать"
    };

    private String[] secondNumbers = {
            "",
            "",
            "двадцать",
            "тридцать",
            "сорок",
            "пятьдесят",
            "шестьдесят",
            "семьдесят",
            "восемьдесят",
            "девяносто"
    };
    private String[] oneHundred = {"сто"};


    public String convert(int number) {
        if (number == 0) {
            return firstNumbers[number];
        } else if (number >= 1 && number <= 19) {
            return firstNumbers[number];
        } else if (number >= 20 && number <= 99) {
            int tenth = number / 10;
            int onec = number % 10;
            if (onec == 0) {
                return secondNumbers[tenth];
            } else {
                return secondNumbers[tenth] + " " + firstNumbers[onec];
            }
        } else if (number == 100) {
            return oneHundred[0];
        } else {
            throw new IllegalArgumentException("OMG! Are u serious? Number from 0 to 100! Not -1, not 101, or anything else");
        }
    }

}
