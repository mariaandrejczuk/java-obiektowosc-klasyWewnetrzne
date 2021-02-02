public class InvoiceRepo {
    private Invoice[] invoices;
    private int invoiceIndex = 0;

    public InvoiceRepo() {
        invoices = new Invoice[10];

    }

    public void add(Invoice invoice) {
        invoices[invoiceIndex++] = invoice;
    }

    public void displayAll() {
        for (int i = 0; i < invoices.length && invoices[i] != null; i++) {
            invoices[i].display();
        }
    }
}

