package es.dionisiocortes.arqhexagonal.ecommerce.infrastructure.shoppingcart.model;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Entity
public class ShoppingCartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "shoppingCartEntity", cascade = CascadeType.ALL)
    private List<CartItemEntity> items = Collections.emptyList();

    private boolean finished;

    public ShoppingCartEntity() {
    }

    public ShoppingCartEntity(Long id, List<CartItemEntity> items, boolean finished) {
        Id = id;
        this.items = items;
        this.finished = finished;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public List<CartItemEntity> getItems() {
        return items;
    }

    public void setItems(List<CartItemEntity> items) {
        this.items = items;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}
