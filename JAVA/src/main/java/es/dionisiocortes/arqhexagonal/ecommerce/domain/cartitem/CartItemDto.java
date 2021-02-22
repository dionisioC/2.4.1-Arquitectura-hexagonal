package es.dionisiocortes.arqhexagonal.ecommerce.domain.cartitem;

import es.dionisiocortes.arqhexagonal.ecommerce.domain.product.FullProductDto;
import es.dionisiocortes.arqhexagonal.ecommerce.infrastructure.shoppingcart.model.CartItemEntity;

public class CartItemDto {

    FullProductDto fullProduct;
    int productNumber;

    public CartItemDto() {
    }

    public CartItemDto(FullProductDto fullProduct, int productNumber) {
        this.fullProduct = fullProduct;
        this.productNumber = productNumber;
    }

    public FullProductDto getProduct() {
        return fullProduct;
    }

    public void setProduct(FullProductDto fullProduct) {
        this.fullProduct = fullProduct;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public static CartItemDto fromProductEntity(CartItemEntity cartItemEntity) {
        return new CartItemDto(
                FullProductDto.fromProductEntity(cartItemEntity.getProductEntity()),
                cartItemEntity.getProductNumber());
    }
}
