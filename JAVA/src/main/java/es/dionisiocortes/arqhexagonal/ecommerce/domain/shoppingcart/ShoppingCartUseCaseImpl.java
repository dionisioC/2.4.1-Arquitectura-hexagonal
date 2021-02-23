package es.dionisiocortes.arqhexagonal.ecommerce.domain.shoppingcart;

import es.dionisiocortes.arqhexagonal.ecommerce.service.ShoppingCartValidationService;

import java.util.Optional;

public class ShoppingCartUseCaseImpl implements ShoppingCartUseCase {

    private ShoppingCartRepository shoppingCartRepository;
    private ShoppingCartValidationService shoppingCartValidationService;

    public ShoppingCartUseCaseImpl(ShoppingCartRepository shoppingCartRepository, ShoppingCartValidationService shoppingCartValidationService) {
        this.shoppingCartRepository = shoppingCartRepository;
        this.shoppingCartValidationService = shoppingCartValidationService;
    }

    @Override
    public FullShoppingCartDto createShoppingCart() {
        return shoppingCartRepository.save(new FullShoppingCartDto());
    }

    @Override
    public Optional<FullShoppingCartDto> findShoppingCartById(long id) {
        return shoppingCartRepository.findById(id);
    }

    @Override
    public void deleteById(long id) {
        shoppingCartRepository.deleteById(id);
    }

    @Override
    public FullShoppingCartDto finishShoppingCart(long id) throws Exception {
        FullShoppingCartDto fullShoppingCartDto = this.findShoppingCartById(id).orElseThrow(Exception::new);
        boolean isValid = shoppingCartValidationService.validate(fullShoppingCartDto);

        if (isValid) {
            fullShoppingCartDto.setFinished(true);
            shoppingCartRepository.finishShoppingCartById(id);
        } else {
            throw new Exception();
        }

        return fullShoppingCartDto;
    }

    @Override
    public FullShoppingCartDto addProduct(long id, long productId, int prodQuantity) {
        return shoppingCartRepository.addProduct(id, productId, prodQuantity);

    }

    @Override
    public Optional<FullShoppingCartDto> deleteProduct(long id, long productId) {
        return shoppingCartRepository.deleteProduct(id, productId);
    }
}
