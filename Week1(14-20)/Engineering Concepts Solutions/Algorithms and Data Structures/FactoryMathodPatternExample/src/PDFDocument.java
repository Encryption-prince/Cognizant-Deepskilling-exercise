public class PDFDocument implements Document {

    @Override
    public void openDoc() {
        System.out.println("Opening PDF Document");
    }

    @Override
    public void closeDoc() {
        System.out.println("Closing PDF Document");
    }
}
