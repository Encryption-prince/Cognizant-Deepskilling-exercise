public class WordDocument implements Document {

    @Override
    public void openDoc() {
        System.out.println("Opening Word Document");
    }

    @Override
    public void closeDoc() {
        System.out.println("Closing Word Document");
    }
}
