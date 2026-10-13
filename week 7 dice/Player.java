public class Player {

    private String name;
    private Dice[] dice;
    private int total;

    public Player(String name, int count, int sides) {

        this.name = name;
        dice = new Dice[count];

        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Dice(sides);
        }
    }

    // Roll all dice
    public void roll() {

        total = 0;

        for (int i = 0; i < dice.length; i++) {
            total += dice[i].roll();
        }
    }

    // method overloading 
    public void roll(int index) {

        dice[index].roll();

        total = 0;

        for (int i = 0; i < dice.length; i++) {
            total += dice[i].getValue();
        }
    }

    // Return total
    public int getTotal() {
        return total;
    }

    // Cheat roll: find the lowest value and update it
    public void cheatRoll() {

        int minIndex = 0;

        for (int i = 1; i < dice.length; i++) {

            if (dice[i].getValue() < dice[minIndex].getValue()) {
                minIndex = i;
            }
        }

        dice[minIndex].roll();

        total = 0;

        for (int i = 0; i < dice.length; i++) {
            total += dice[i].getValue();
        }
    }

    @Override
    public String toString() {
        return name + ": " + total;
    }
}