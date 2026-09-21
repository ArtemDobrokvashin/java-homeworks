package hard1.model;

public class CaesarCipher implements CipherAlgorithm {
    private static final String ALPHABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя"
            + "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"
            + "abcdefghijklmnopqrstuvwxyz"
            + "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + " .,:;!?-0123456789()";

    @Override
    public String encrypt(String text, int key) {
        if (key < 0) {
            throw new IllegalArgumentException("Ключ не может быть отрицательным");
        }
        StringBuilder cipherText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c =  text.charAt(i);
            int ind = ALPHABET.indexOf(c);
            if (ind == -1) {
                cipherText.append(c);
            }
            else {
                int newIndx = (ind + key) % ALPHABET.length();
                cipherText.append(ALPHABET.charAt(newIndx));
            }
        }
        return cipherText.toString();
    }

    @Override
    public String decrypt(String text, int key) {
        return encrypt(text, ALPHABET.length() - key);
    }
}
