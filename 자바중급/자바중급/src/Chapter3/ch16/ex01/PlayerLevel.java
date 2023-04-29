package Chapter3.ch16.ex01;

public interface PlayerLevel {
    void run();

    void jump();

    void turn();

    void showLevelMessage();

    default void go(int a) {
        showLevelMessage();
        run();
        for(int i=0;i<a;i++) {
            jump();
        }
        turn();

    }
}
