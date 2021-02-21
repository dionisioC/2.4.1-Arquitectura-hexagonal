package es.dionisiocortes.arqhexagonal.ecommerce.domain;

public class Product {

    private Long id;
    private String name;
    private String description;
    private String category;
    private String manufacturer;
    private int quantity;

    public Product(Long id, String name, String description, String category, String manufacturer, int quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
    }

    public Product() {
    }
}
