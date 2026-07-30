package hard1.src.lore;

import java.util.Random;

public enum RightDescriptions {
    BUG("Слышал, кто-то выжил там. Но это был баг. Исправили."),
    DEAD("Ты уже мёртв. Просто ещё не получил уведомление — заблокировал РосКомНадзор."),
    ROT("Здесь пахнет успехом. И гнилью. В основном гнилью."),
    SCAM("За этой дверью — полцарства и рука принцессы! Осталось только подтвердить личность: пришлите код из SMS.");

    private final String text;
    private static final Random RANDOM = new Random();

    RightDescriptions(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public static String getRandom() {
        RightDescriptions[] values = values();
        return values[RANDOM.nextInt(values.length)].getText();
    }
}
