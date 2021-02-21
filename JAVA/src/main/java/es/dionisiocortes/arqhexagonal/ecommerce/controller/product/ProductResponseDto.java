package es.dionisiocortes.arqhexagonal.ecommerce.controller.product;

import es.dionisiocortes.arqhexagonal.ecommerce.domain.product.FullProductDto;
import es.dionisiocortes.arqhexagonal.ecommerce.domain.product.ProductDto;

public class ProductResponseDto {

    private Long id;
    private String name;
    private String description;
    private String category;
    private String manufacturer;
    private int quantity;

    public static ProductResponseDto fromFullProductDto(FullProductDto fullProductDto) {
        return new ProductResponseDto(
                fullProductDto.getId(),
                fullProductDto.getName(),
                fullProductDto.getDescription(),
                fullProductDto.getCategory(),
                fullProductDto.getManufacturer(),
                fullProductDto.getQuantity());
    }

    public static ProductResponseDto fromFullProductDto(ProductRequestDto fullProductDto) {
        return new ProductResponseDto(
                fullProductDto.getName(),
                fullProductDto.getDescription(),
                fullProductDto.getCategory(),
                fullProductDto.getManufacturer(),
                fullProductDto.getQuantity());
    }

    public static ProductDto fromFullProductRequestDto(ProductRequestDto fullProductDto) {
        return new ProductDto(
                fullProductDto.getName(),
                fullProductDto.getDescription(),
                fullProductDto.getCategory(),
                fullProductDto.getManufacturer(),
                fullProductDto.getQuantity());
    }

    public ProductResponseDto() {
    }

    public ProductResponseDto(Long id, String name, String description, String category, String manufacturer, int quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
    }

    public ProductResponseDto(String name, String description, String category, String manufacturer, int quantity) {
        this(null, name, description, category, manufacturer, quantity);
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
