package es.dionisiocortes.arqhexagonal.ecommerce.domain;

public class FullProductDto {

    private Long id;
    private String name;
    private String description;
    private String category;
    private String manufacturer;
    private int quantity;

    public FullProductDto() {
    }

    public FullProductDto(String name, String description, String category, String manufacturer, int quantity) {
        this(null, name, description, category, manufacturer, quantity);
    }

    public FullProductDto(Long id, String name, String description, String category, String manufacturer, int quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
    }

    public static FullProductDto fromBookDto(ProductDto product) {
        return new FullProductDto(
                product.getName(),
                product.getDescription(),
                product.getCategory(),
                product.getManufacturer(),
                product.getQuantity());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
