package bg.softuni.books.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "cart_items")
public class CartItem extends BaseEntity {

    @ManyToOne(optional = false)
    private Book book;

    @ManyToOne(optional = false)
    private ShoppingCart shoppingCart;

    private BigDecimal price;

    private int quantity;

    public CartItem() {
    }

    public Book getBook() {
        return book;
    }

    public CartItem setBook(Book book) {
        this.book = book;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public CartItem setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public CartItem setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public CartItem setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
}
