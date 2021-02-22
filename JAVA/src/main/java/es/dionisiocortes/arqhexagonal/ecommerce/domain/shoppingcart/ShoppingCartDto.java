package es.dionisiocortes.arqhexagonal.ecommerce.domain.shoppingcart;

import es.dionisiocortes.arqhexagonal.ecommerce.domain.cartitem.CartItemDto;

import java.util.List;

public class ShoppingCartDto {

    private List<CartItemDto> items;
    private boolean finished;


    public List<CartItemDto> getItems() {
        return items;
    }

    public void setItems(List<CartItemDto> items) {
        this.items = items;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}
