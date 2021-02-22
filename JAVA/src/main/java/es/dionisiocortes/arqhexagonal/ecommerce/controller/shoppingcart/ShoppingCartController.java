package es.dionisiocortes.arqhexagonal.ecommerce.controller.shoppingcart;

import es.dionisiocortes.arqhexagonal.ecommerce.service.ProductService;
import es.dionisiocortes.arqhexagonal.ecommerce.service.ShoppingCartService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
public class ShoppingCartController {

    private ShoppingCartService shoppingCartService;
    private ProductService productService;

    public ShoppingCartController(ShoppingCartService shoppingCartService, ProductService productService) {
        this.shoppingCartService = shoppingCartService;
        this.productService = productService;
    }

    @PostMapping("/shoppingcarts")
    public ShoppingCartResponseDto createShoppingCart() {
        ShoppingCartResponseDto shoppingCartResponseDto = this.shoppingCartService.save();
        return shoppingCartResponseDto;
    }

    @PatchMapping("/shoppingcarts/{id}")
    public ShoppingCartResponseDto updateShoppingCart(@PathVariable long id) {
        try {
            return this.shoppingCartService.finishShoppingCart(id);
        } catch (Exception e) {
            return null;
        }
    }

    @GetMapping("/shoppingcarts/{id}")
    public ShoppingCartResponseDto getShoppingCart(@PathVariable long id) {
        return this.shoppingCartService.findById(id).orElseThrow();
    }

    @DeleteMapping("/shoppingcarts/{id}")
    public void deleteShoppingCart(@PathVariable long id) {
        this.shoppingCartService.deleteById(id);
    }


    @PostMapping("/{id}/product/{prodId}/quantity/{prodQuantity}")
    public ShoppingCartResponseDto addProductToShoppingCart(@PathVariable long id, @PathVariable long prodId, @PathVariable int prodQuantity) {
        return this.shoppingCartService.addProduct(id, prodId, prodQuantity);
    }

/*

            DELETE /api/shoppingcarts/:cart_id/product/:prod_id - Borra un producto
    específico de un carrito de compra
*/

}
