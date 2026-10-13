public class Main {

    public static void main(String[] args) {

        Player player = new Player("Ayesha", 3, 6);

        // Roll all dice
        player.roll();

        System.out.println(player);
        System.out.println("Total: " + player.getTotal());

        // Roll only the die at index 1
        player.roll(1);

        System.out.println(player);
        System.out.println("Total after rolling index 1: " + player.getTotal());

        // Cheat roll: lowest die reroll
        player.cheatRoll();

        System.out.println(player);
        System.out.println("Total after cheat roll: " + player.getTotal());
    }
}