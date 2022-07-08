class Coin{
    private static int heads;
    private static int tails;

    public static int getHeads () {
        return heads;
    }

    public static int getTails () {
        return tails;
    }

    public static String toss () {
        int side = ((int)(Math.random()*10))%2;
        if (side == 0) {
            heads++;
            return "Heads";
        } else {
            tails++;
            return "Tails";
        }
    }
}

public class HeadsOrTails{
    public static void main (String[] arg) {
        System.out.println("Tossing a coin...");
        for (int i = 0; i < 3; i++) {
            System.out.println("Round " + i + ": " + Coin.toss());
        }
        System.out.println("Heads: " + Coin.getHeads() + ", Tails: " + Coin.getTails());
        if (Coin.getHeads() > Coin.getTails()) System.out.println("You won");
        else System.out.println("You lost");
    }
}