package daos;

import javax.persistence.*;

@Entity
@Table(name = "carts")

public class cartHibernate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private Integer cartId;

    @Column(name = "plan_id")
    private Integer planId;

    @Column(name = "prod_id")
    private Integer prodId;

    @Column(name = "quantity")
    private Integer quantity;

    public cartHibernate() {
    }

    public cartHibernate(Integer cartId, Integer planId, Integer prodId, Integer quantity) {
        this.cartId = cartId;
        this.planId = planId;
        this.prodId = prodId;
        this.quantity = quantity;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Cart [id=" + cartId + ", planId=" + planId + ", prodId=" + prodId + ", quantity=" + quantity + "]";
    }
}
