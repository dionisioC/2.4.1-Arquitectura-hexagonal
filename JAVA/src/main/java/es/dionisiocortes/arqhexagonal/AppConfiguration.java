package es.dionisiocortes.arqhexagonal;

import es.dionisiocortes.arqhexagonal.ecommerce.domain.product.ProductRepository;
import es.dionisiocortes.arqhexagonal.ecommerce.domain.product.ProductUseCase;
import es.dionisiocortes.arqhexagonal.ecommerce.domain.product.ProductUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public ProductUseCase productUseCase(ProductRepository productRepository) {
        return  new ProductUseCaseImpl(productRepository);
    }

}
