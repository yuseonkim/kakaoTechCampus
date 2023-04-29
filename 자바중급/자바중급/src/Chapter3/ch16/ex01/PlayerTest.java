package Chapter3.ch16.ex01;

public class PlayerTest {
    public static void main(String[] args) {
        Player a = new Player();
        a.play(1);

        a.upgradeLevel();
        a.play(2);

        a.upgradeLevel();
        a.play(3);
    }
}
