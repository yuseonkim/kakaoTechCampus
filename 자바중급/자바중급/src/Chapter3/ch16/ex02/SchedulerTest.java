package Chapter3.ch16.ex02;

import java.io.IOException;
import java.util.Scanner;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {
        Scheduler a = null;
        System.out.println("상담원 연결 방식을 선택하세요");
        System.out.println("R : 한명씩 차례대로");
        System.out.println("L : 대기가 적은 상담원 우선");
        System.out.println("P : 숙련된 상담원 우선");

        int ch = System.in.read();
        if(ch == 'R'){
            a = new RoundRobin();
        }else if (ch == 'L'){
            a = new LeastJob();
        }else if (ch == 'P'){
            a = new PriorityAllocation();
        }else{
            System.out.println("error");
        }

        a.getNextCall();
        a.sendCalltoAgent();


    }
}
