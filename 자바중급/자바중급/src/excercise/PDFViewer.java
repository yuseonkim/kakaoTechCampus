package excercise;

public class PDFViewer extends Application {
    @Override
    Document createDocument() {
        return new PDFDocument();
    }
}
