package es.dionisiocortes.arqhexagonal.ecommerce.domain.product;

import java.util.Collection;
import java.util.Optional;

public interface ProductUseCase {

    public FullProductDto createProduct(ProductDto product);

    public Collection<FullProductDto> findAllProducts();

    public Optional<FullProductDto> findProductById(Long id);

    public void deleteById(Long id);
}
