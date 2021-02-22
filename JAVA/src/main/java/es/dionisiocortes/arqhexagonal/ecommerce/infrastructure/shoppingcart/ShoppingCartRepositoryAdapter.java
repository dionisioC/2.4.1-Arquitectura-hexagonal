package es.dionisiocortes.arqhexagonal.ecommerce.infrastructure.shoppingcart;

import es.dionisiocortes.arqhexagonal.ecommerce.domain.cartitem.CartItemDto;
import es.dionisiocortes.arqhexagonal.ecommerce.domain.shoppingcart.FullShoppingCartDto;
import es.dionisiocortes.arqhexagonal.ecommerce.domain.shoppingcart.ShoppingCartRepository;
import es.dionisiocortes.arqhexagonal.ecommerce.infrastructure.product.ProductRepositoryAdapter;
import es.dionisiocortes.arqhexagonal.ecommerce.infrastructure.shoppingcart.model.CartItemEntity;
import es.dionisiocortes.arqhexagonal.ecommerce.infrastructure.shoppingcart.model.ShoppingCartEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class ShoppingCartRepositoryAdapter implements ShoppingCartRepository {


    private static FullShoppingCartDto toFullShoppingCartDto(ShoppingCartEntity shoppingCartEntity) {

        List<CartItemDto> items = shoppingCartEntity.getItems().stream().map(CartItemEntity::fromCartItemDto).collect(Collectors.toList());

        return new FullShoppingCartDto(
                shoppingCartEntity.getId(),
                items,
                shoppingCartEntity.isFinished());
    }

    @Override
    public FullShoppingCartDto save(FullShoppingCartDto fullShoppingCartDTO) {
        return null;
    }

    @Override
    public Optional<FullShoppingCartDto> findById(long id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public FullShoppingCartDto addProduct(long id, long productId, int prodQuantity) {
        return null;
    }

    @Override
    public Optional<FullShoppingCartDto> deleteProduct(long id, long productId) {
        return Optional.empty();
    }

    @Override
    public void finishShoppingCartById(long id) {

    }

    @Override
    public void update(FullShoppingCartDto fullShoppingCartDto) {

    }
}
