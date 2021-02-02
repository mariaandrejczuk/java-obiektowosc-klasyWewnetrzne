import java.util.Scanner;

public class InvoiceApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "UTF-8");
        int option;
        InvoiceRepo invoiceRepo = new InvoiceRepo();

        do {
            System.out.println("--------------Invoice App --------------");
            System.out.println("1 - add invoice");
            System.out.println("2 - display invoices");
            System.out.println("3 - stop");

            System.out.print("Option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Number: ");
                    int number = scanner.nextInt();

                    System.out.println("Ordinal number: ");
                    int ordinalNumber = scanner.nextInt();

                    System.out.println("Price: ");
                    double price = scanner.nextDouble();

                    Invoice invoice = new Invoice(number, ordinalNumber, price);//tworzę nową fakturę

                    invoiceRepo.add(invoice); //dodaje nowa fakturę

                    break;
                case 2:
                    invoiceRepo.displayAll();
                    break;
            }
        } while (option != 3);
    }
}
