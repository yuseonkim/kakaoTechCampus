package Chapter2.ch14;

public class Subway {
    int lineNumber;
    int passangerCount;
    int money;

    public Subway(int lineNumber){
        this.lineNumber = lineNumber;
    }

    public void take(int money){
        this.money += money;
        passangerCount++;
    }

    public void showSubwayInfo(){
        System.out.println(lineNumber+"의 승객수는 "+passangerCount+"명 이고 수입은 "+money+"원 입니다");
    }

}
