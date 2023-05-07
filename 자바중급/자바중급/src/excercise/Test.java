package excercise;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<Application> arr = new ArrayList<>();
        arr.add(new HWPViewer());
        arr.add(new PDFViewer());
        arr.add(new PictureViewer());

        for(Application i : arr){
            i.newDocument();
            System.out.println();
        }


    }


}
