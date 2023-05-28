import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        getUlma();
    }
    static void getUlma(){
        Scanner sc = new Scanner(System.in);
        System.out.print("총 소지 금액 입력 : ");
        int total = sc.nextInt();
        int rest = total;
        ArrayList<Double> arr = new ArrayList<Double>();
        while(true){
            System.out.print("가격입력 :         0 누를 시 종료 및 정산");
            int price  = sc.nextInt();
            rest -= price;
            double result;
            if(price== 0 ){

                for(double a : arr){
                    System.out.println("-------------------------------");
                    System.out.println("퍼센트 : "+ a+"%");
                    System.out.println("-------------------------------");
                }
                System.out.println(total);
                System.out.println(( (double)rest / (double)total )* 100);
            }
            result =( (double)price / total )* 100;
            arr.add(result);
            System.out.println("-------------------------------");
            System.out.println("가격 : " + price + "퍼센트 : "+ result+"%");
            System.out.println("-------------------------------");

        }

    }
}
