package entities;

import java.util.Objects;

public class Cart {
    private Integer planId;
    private Integer productId;
    private Integer quantity;
    private Product product;

    public Cart() {
    }

    public Cart(Integer planId, Integer productId, Integer quantity, Product product) {
        this.planId = planId;
        this.productId = productId;
        this.quantity = quantity;
        this.product = product;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return Objects.equals(planId, cart.planId) && Objects.equals(productId, cart.productId) && Objects.equals(quantity, cart.quantity) && Objects.equals(product, cart.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planId, productId, quantity, product);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "planId=" + planId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", product=" + product +
                '}';
    }
}
