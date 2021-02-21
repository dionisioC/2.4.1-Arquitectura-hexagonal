package es.dionisiocortes.arqhexagonal.ecommerce.service;

import es.dionisiocortes.arqhexagonal.ecommerce.controller.ProductRequestDto;
import es.dionisiocortes.arqhexagonal.ecommerce.controller.ProductResponseDto;
import es.dionisiocortes.arqhexagonal.ecommerce.domain.FullProductDto;
import es.dionisiocortes.arqhexagonal.ecommerce.domain.ProductDto;
import es.dionisiocortes.arqhexagonal.ecommerce.domain.ProductUseCase;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private ProductUseCase productUseCase;

    public ProductService(ProductUseCase productUseCase) {
        this.productUseCase = productUseCase;
    }

    public Collection<ProductResponseDto> findAll() {
        return productUseCase
                .findAllProducts()
                .stream()
                .map(ProductResponseDto::fromFullProductDto)
                .collect(Collectors.toList());
    }

    public Optional<ProductResponseDto> findById(Long id) {
        return productUseCase.findProductById(id).map(ProductResponseDto::fromFullProductDto);
    }

    public FullProductDto save(ProductRequestDto productRequestDto) {
        ProductDto productDto = ProductResponseDto.fromFullProductRequestDto(productRequestDto);
        return productUseCase.createProduct(productDto);
    }

    public void deleteById(Long id) {
        productUseCase.deleteById(id);
    }

}
