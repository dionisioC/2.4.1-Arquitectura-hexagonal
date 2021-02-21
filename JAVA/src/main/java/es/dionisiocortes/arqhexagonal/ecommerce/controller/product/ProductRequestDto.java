package es.dionisiocortes.arqhexagonal.ecommerce.controller.product;

import es.dionisiocortes.arqhexagonal.ecommerce.domain.product.FullProductDto;

public class ProductRequestDto {

    private String name;
    private String description;
    private String category;
    private String manufacturer;
    private int quantity;

    public static ProductRequestDto fromFullProductDto(FullProductDto fullProductDto) {
        return new ProductRequestDto(
                fullProductDto.getName(),
                fullProductDto.getDescription(),
                fullProductDto.getCategory(),
                fullProductDto.getManufacturer(),
                fullProductDto.getQuantity());
    }

    public ProductRequestDto() {
    }

    public ProductRequestDto(String name, String description, String category, String manufacturer, int quantity) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
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
