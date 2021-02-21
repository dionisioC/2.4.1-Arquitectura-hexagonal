package es.dionisiocortes.arqhexagonal.ecommerce.infrastructure.repository;

import es.dionisiocortes.arqhexagonal.ecommerce.infrastructure.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpaRepository extends JpaRepository<ProductEntity, Long> {

}
