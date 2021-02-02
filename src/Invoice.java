public class Invoice {
    private int number;
    private Item item;

    public Invoice(int number, int ordinalNumber, double price) {  //usuięto Item[] item z konstruktora,a dodano int ordinalNumber i double Price - ktoś kto będzie wpriwadzał fakturę, nie bedzie musiąl myśleć o itemie.
        this.number = number;
        item = new Item(ordinalNumber, price);
    }

    public void display() {
        System.out.println("Number: " + number);
        System.out.println("Ordinal number: " + item.ordinalNumber);
        System.out.println("Price: " + item.price);
    }

    private class Item {  //klasa prywatna, będzie dostapna tylko z poziomu klasy Invoice.java,nie można sie dostać bezpośrednio, jedynie poprzez Invoice.
        private int ordinalNumber;
        private double price;

        public Item(int ordinalNumber, double price) {
            this.ordinalNumber = ordinalNumber;
            this.price = price;
        }
    }
}
