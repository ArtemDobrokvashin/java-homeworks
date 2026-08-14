package middle4;

public class Middle4 {

    public static void main(String[] args) {
        try {
            String email = "ololoshkamail.ru";
            errorMthd(email);


        } catch (Exception e){
            System.err.println(e.getMessage());
            /* System.out — обычный вывод (попадает в файл, если перенаправить).
            System.err — ошибки (всегда видны в консоли, даже если вывод ушёл в файл). */
            
        }
    }

    public static void errorMthd(String email){
        if (!email.contains("@"))
            throw new IllegalArgumentException("Your email address is invalid");
    }

}
