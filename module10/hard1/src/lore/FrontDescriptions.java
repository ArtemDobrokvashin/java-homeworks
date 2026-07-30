package hard1.src.lore;

import java.util.Random;

public enum FrontDescriptions {
    FALSE_HOPE("Спереди — свет в конце тоннеля! Жаль, это фары телеги с гоблинами."),
    NO_LIVES_LEFT("Там пахнет новым началом. Жаль, у тебя кончились жизни."),
    NOT_A_HERO("Иди вперёд! Герои умирают красиво... Жаль, что ты не герой."),
    GAITI("Выходит откуда-то спереди Толстый кот и шепчет: \"Гаити, Гаити…\" А потом добавляет: \"А нас и тут неплохо убивают.\"");

    private final String text;
    private static final Random RANDOM = new Random();

    FrontDescriptions(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public static String getRandom() {
        FrontDescriptions[] values = values();
        return values[RANDOM.nextInt(values.length)].getText();
    }
}
