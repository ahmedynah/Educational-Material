/**
 * Adapter that allows OldPrinter to be used as a Printer.
 */
public class PrinterAdapter implements Printer {
    private final OldPrinter oldPrinter;

    /**
     * Constructs the adapter using an instance of OldPrinter.
     * @param oldPrinter The old printer object to adapt.
     */
    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    /**
     * Adapts the oldPrintMethod to the print method.
     * @param document The document to print.
     */
    @Override
    public void print(String document) {
        oldPrinter.oldPrintMethod(document); // Delegate to old method
    }
}
