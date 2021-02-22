package es.dionisiocortes.arqhexagonal.ecommerce.infrastructure.shoppingcart.repository;

import es.dionisiocortes.arqhexagonal.ecommerce.infrastructure.shoppingcart.model.CartItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemJpaRepository extends JpaRepository<CartItemEntity, Long> {
}
