package es.dionisiocortes.arqhexagonal.ecommerce.infrastructure.shoppingcart.model;

import es.dionisiocortes.arqhexagonal.ecommerce.domain.cartitem.CartItemDto;
import es.dionisiocortes.arqhexagonal.ecommerce.domain.product.FullProductDto;
import es.dionisiocortes.arqhexagonal.ecommerce.infrastructure.product.model.ProductEntity;

import javax.persistence.*;

@Entity
public class CartItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ShoppingCartEntity shoppingCartEntity;

    @ManyToOne
    private ProductEntity productEntity;

    int productNumber;

    public static CartItemDto fromCartItemDto(CartItemEntity cartItemEntity) {
        return new CartItemDto(
                FullProductDto.fromProductEntity(cartItemEntity.getProductEntity()),
                cartItemEntity.getProductNumber());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShoppingCartEntity getShoppingCartEntity() {
        return shoppingCartEntity;
    }

    public void setShoppingCartEntity(ShoppingCartEntity shoppingCartEntity) {
        this.shoppingCartEntity = shoppingCartEntity;
    }

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }
}
