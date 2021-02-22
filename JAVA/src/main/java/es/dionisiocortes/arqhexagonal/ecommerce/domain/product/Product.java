package es.dionisiocortes.arqhexagonal.ecommerce.domain.product;

public class Product {

    private String name;
    private String description;
    private String category;
    private String manufacturer;
    private int quantity;

    public Product(String name, String description, String category, String manufacturer, int quantity) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
    }

    public Product() {
    }
}
