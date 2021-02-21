package es.dionisiocortes.arqhexagonal.ecommerce.controller;

import static org.springframework.web.servlet.support.ServletUriComponentsBuilder.fromCurrentRequest;

import es.dionisiocortes.arqhexagonal.ecommerce.domain.FullProductDto;
import es.dionisiocortes.arqhexagonal.ecommerce.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Collection;

@RequestMapping("/api")
@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products/")
    public Collection<ProductResponseDto> getProducts(){
        return productService.findAll();
    }

    @GetMapping("/products/{id}")
    public ProductResponseDto getBook(@PathVariable long id) {
        return productService.findById(id).orElseThrow();
    }

    @DeleteMapping("/products/{id}")
    public void deleteBook(@PathVariable long id) {
        productService.deleteById(id);
    }

    @PostMapping("/products/")
    public ResponseEntity<ProductResponseDto> createBook(@RequestBody ProductRequestDto product) {

        FullProductDto fullProductDto = productService.save(product);

        ProductResponseDto responseBookDto = new ProductResponseDto(
                fullProductDto.getId(),
                fullProductDto.getName(),
                fullProductDto.getDescription(),
                fullProductDto.getCategory(),
                fullProductDto.getManufacturer(),
                fullProductDto.getQuantity());

        URI location = fromCurrentRequest().path("/{id}")
                .buildAndExpand(fullProductDto.getId()).toUri();

        return ResponseEntity.created(location).body(responseBookDto);
    }

}
