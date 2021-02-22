package es.dionisiocortes.arqhexagonal.ecommerce.domain.shoppingcart;

import java.util.Optional;

public interface ShoppingCartRepository {

    FullShoppingCartDto save(FullShoppingCartDto fullShoppingCartDTO);

    Optional<FullShoppingCartDto> findById(long id);

    void deleteById(long id);

    FullShoppingCartDto addProduct(long id, long productId, int prodQuantity);

    Optional<FullShoppingCartDto> deleteProduct(long id, long productId);

    void finishShoppingCartById(long id);

    void update(FullShoppingCartDto fullShoppingCartDto);
}
