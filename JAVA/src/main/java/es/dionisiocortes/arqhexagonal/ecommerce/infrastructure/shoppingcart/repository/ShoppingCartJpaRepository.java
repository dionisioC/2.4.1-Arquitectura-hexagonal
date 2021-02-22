package es.dionisiocortes.arqhexagonal.ecommerce.infrastructure.shoppingcart.repository;

import es.dionisiocortes.arqhexagonal.ecommerce.infrastructure.product.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartJpaRepository extends JpaRepository<ProductEntity, Long> {
}
