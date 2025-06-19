public class TestFactoryPattern {
    public static void main(String[] args) {

        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.openDoc();
        wordDoc.closeDoc();

        System.out.println("--------------------");

        DocumentFactory pdfFactory = new PDFDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.openDoc();
        pdfDoc.closeDoc();

        System.out.println("--------------------");

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.openDoc();
        excelDoc.closeDoc();
    }
}
