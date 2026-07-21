

public class Easy2 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat();
        animals[1] = new Fox();
        animals[2] = new Kangaroo();
        animals[3] = new Сustomer();

        for (Animal animal : animals){
            animal.say();
            animal.walk();
        }

    }
}
