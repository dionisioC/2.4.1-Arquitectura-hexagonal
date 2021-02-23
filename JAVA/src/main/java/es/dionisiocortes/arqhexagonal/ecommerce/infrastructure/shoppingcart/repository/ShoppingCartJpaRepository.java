package es.dionisiocortes.arqhexagonal.ecommerce.infrastructure.shoppingcart.repository;

import es.dionisiocortes.arqhexagonal.ecommerce.infrastructure.shoppingcart.model.ShoppingCartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ShoppingCartJpaRepository extends JpaRepository<ShoppingCartEntity, Long> {
    @Modifying
    @Query("update ShoppingCartEntity s set s.finished = true where s.Id = :id")
    void updateShoppingCartFinishedbyId(@Param("id") Long id);

}
