package hard1.src.lore;

import java.util.Random;

public enum LeftDescriptions {
    SILENCE("Слева — тихо. Слишком тихо. Даже черви замолчали в ожидании твоего тела."),
    EXIT("Слева — выход из игры. Буквально. Но это не точно… Рискнёшь?"),
    NO_SAVE("Там пахнет новым началом. Жаль, у игры нет сохранения."),
    ORC_SERVICE("Служба для орков и гоблинов. Не штурм. Просто… заходи.");

    private final String text;
    private static final Random RANDOM = new Random();

    LeftDescriptions(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public static String getRandom() {
        LeftDescriptions[] values = values();
        return values[RANDOM.nextInt(values.length)].getText();
    }
}
