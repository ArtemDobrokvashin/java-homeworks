package hard1;


public class Word {
    private String hiddenWord;
    private char[] starWord;

    public Word(String hiddenWord){
        this.hiddenWord = hiddenWord.toLowerCase();
        this.starWord = new char[hiddenWord.length()];
        for (int i = 0; i < hiddenWord.length(); i++) this.starWord[i] = '*';
    }

    public boolean openLetter(char letter){
        boolean foundLetter = false;
        for (int i = 0; i < hiddenWord.length(); i++){
            if (hiddenWord.charAt(i) == letter){
                starWord[i] = letter;
                foundLetter = true;
            }
        }
        return foundLetter;
    }

    public String getDisplay(){
        return new String(this.starWord);
    }

    public boolean isGuessed() {
        for (char c : starWord) {
            if (c == '*') return false;
        }
        return true;
    }

    public String getHiddenWord() {
        return  hiddenWord;
    }
}
