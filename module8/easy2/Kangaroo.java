

public class Kangaroo extends Animal{
    @Override
    public void walk() {
        System.out.println(getClass().getSimpleName() + " Jump, jump");
    }

    @Override
    public void say() {
        System.out.println(getClass().getSimpleName() + " Кенгуру действительно общаются — просто их «язык» не такой замысловатый, как у многих других животных, и состоит в основном из простых звуков и телодвижений.");
    }
}
