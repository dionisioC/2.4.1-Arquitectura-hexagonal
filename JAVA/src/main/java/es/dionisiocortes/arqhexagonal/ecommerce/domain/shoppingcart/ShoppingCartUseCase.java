package es.dionisiocortes.arqhexagonal.ecommerce.domain.shoppingcart;

import java.util.Optional;

public interface ShoppingCartUseCase {

    public FullShoppingCartDto createShoppingCart();

    public Optional<FullShoppingCartDto> findShoppingCartById(long id);

    public void deleteById(long id);

    public FullShoppingCartDto finishShoppingCart(long id) throws Exception;

    public FullShoppingCartDto addProduct(long id, long productId, int prodQuantity);

    public Optional<FullShoppingCartDto> deleteProduct(long id, long productId);

}
