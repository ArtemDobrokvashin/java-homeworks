package hard1.model;

public interface CipherAlgorithm {
    String encrypt(String text, int key);
    String decrypt(String text, int key);
}
