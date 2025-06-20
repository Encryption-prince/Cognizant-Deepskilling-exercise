public class ExcelDocument implements Document {

    @Override
    public void openDoc() {
        System.out.println("Opening Excel Document");
    }

    @Override
    public void closeDoc() {
        System.out.println("Closing Excel Document");
    }
}
