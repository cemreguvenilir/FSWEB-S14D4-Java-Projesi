package Monster;

public class Main {
    public static void main(String[] args) {
        Monster troll = new Troll("x", 400, 40);
        System.out.println(troll.attack());
        Monster werewolf = new Werewolf("y", 500, 50);
        System.out.println(troll.attack());
    }
}
