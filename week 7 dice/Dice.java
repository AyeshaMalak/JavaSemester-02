import java.util.Random;

public class Dice {

    private int sides;
    private int value;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int roll() {
        Random random = new Random();

        value = random.nextInt(1, sides + 1);

        return value;
    }

    public int getSides() {
        return sides;
    }

    public int getValue() {
        return value;
    }
}