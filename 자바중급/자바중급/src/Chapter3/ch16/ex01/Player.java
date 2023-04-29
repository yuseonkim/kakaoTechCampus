package Chapter3.ch16.ex01;

public class Player {
    private PlayerLevel level;
    public Player(){
        level = new BeginnerLevel();
    }

    void upgradeLevel(){
        if(level instanceof BeginnerLevel){
            level = new AdvancedLevel();
        }else if(level instanceof AdvancedLevel){
            level = new SuperLevel();
        }
    }

    void play(int a){
        level.go(a);
    }
}
