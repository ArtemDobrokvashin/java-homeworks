package middle1;

public abstract class Handler {
    private Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    protected Handler getNext() {
        return next;
    }

    public abstract boolean handle(String drinkName, DrinkShopFacade facade);
}