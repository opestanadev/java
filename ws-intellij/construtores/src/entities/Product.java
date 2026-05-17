package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    // Construtor padrão (Caso eu ainda queria a opção de criar um objeto com construtor vazio)
    public Product(){}

    // Construtor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        // a palavra this serve para diferenciar o atributo do parâmetro do construtor que possui o mesmo nome.
    }

    // Sobrecarga do construtor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock() {
        return quantity * price;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
