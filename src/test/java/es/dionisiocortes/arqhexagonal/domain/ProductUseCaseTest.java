package es.dionisiocortes.arqhexagonal.domain;

import es.dionisiocortes.arqhexagonal.ecommerce.domain.FullProductDto;
import es.dionisiocortes.arqhexagonal.ecommerce.domain.ProductDto;
import es.dionisiocortes.arqhexagonal.ecommerce.domain.ProductRepository;
import es.dionisiocortes.arqhexagonal.ecommerce.domain.ProductUseCaseImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
@DisplayName("BookRestController unit tests")
public class ProductUseCaseTest {

    @Mock
    ProductRepository productRepository;

    @InjectMocks
    ProductUseCaseImpl productUseCaseImpl;

    @Test
    @DisplayName("Given a product when adding it to the database then the product is inserted correctly")
    void givenAProductWhenInsertItThenOK() {

        ProductDto productDTO = new ProductDto("Product01", "Description01", "Category01", "Manufacturer01", 100);
        FullProductDto fullProductDtoReturned = new FullProductDto(1L, "Product01", "Description01", "Category01", "Manufacturer01", 100);

        when(this.productRepository.save(Mockito.any())).thenReturn(fullProductDtoReturned);
        FullProductDto result = this.productUseCaseImpl.createProduct(productDTO);

        verify(productRepository, times(1)).save(Mockito.any());
        assertEquals(1L, result.getId());
        assertEquals(productDTO.getDescription(), result.getDescription());
        assertEquals(productDTO.getName(), result.getName());

    }

    @Test
    @DisplayName("Given an id when deleting it from the database then the product is not there")
    void givenAProductWhenDeleteItThenOK() {
        Long id = 1L;
        doNothing().when(this.productRepository).deleteById(id);
        this.productUseCaseImpl.deleteById(id);
        verify(this.productRepository, times(1)).deleteById(id);

    }

}
