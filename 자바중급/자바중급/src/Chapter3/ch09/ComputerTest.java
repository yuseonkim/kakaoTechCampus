package Chapter3.ch09;

import java.util.ArrayList;

public class ComputerTest {
    public static void main(String[] args){

        Computer desktop = new Desktop();
        Computer myNotebook = new MyNotebook();
        desktop.display();
        desktop.typing();
        myNotebook.display();
        myNotebook.typing();

    }
}
