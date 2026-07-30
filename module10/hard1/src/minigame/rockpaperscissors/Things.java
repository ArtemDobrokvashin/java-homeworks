package hard1.src.minigame.rockpaperscissors;

public enum Things {
    КАМЕНЬ,
    НОЖНИЦЫ,
    БУМАГА;


    public static Things fromGame(int choose) {
        if (choose < 1 || choose > 3) {
            throw new IllegalArgumentException("Неправильный выбор. Укажите или 1(камень), или 2(ножницы), или 3(бумага)");
        }
        return values()[choose - 1];
    }
}
