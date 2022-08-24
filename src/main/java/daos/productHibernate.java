package daos;
import javax.persistence.*;
@Entity
@Table(name = "product")

public class productHibernate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_id")
    private Integer prodId;
    @Column(name = "prod_name")
    private String prodName;
    @Column(name = "prod_description")
    private String prodDescription;
    @Column(name = "prod_type")
    private String prodType;
    @Column(name = "prod_pic")
    private String prodPic;
    @Column(name = "num_left")
    private Integer numLeft;
    @Column(name = "price")
    private float price;
    @Column(name = "on_sale")
    private boolean onSale;

    public productHibernate() {
    }

    public productHibernate(Integer prodId, String prodName, String prodDescription, String prodType, String prodPic, Integer numLeft, float price, boolean onSale) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodDescription = prodDescription;
        this.prodType = prodType;
        this.prodPic = prodPic;
        this.numLeft = numLeft;
        this.price = price;
        this.onSale = onSale;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdDescription() {
        return prodDescription;
    }

    public void setProdDescription(String prodDescription) {
        this.prodDescription = prodDescription;
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType;
    }

    public String getProdPic() {
        return prodPic;
    }

    public void setProdPic(String prodPic) {
        this.prodPic = prodPic;
    }

    public Integer getNumLeft() {
        return numLeft;
    }

    public void setNumLeft(Integer numLeft) {
        this.numLeft = numLeft;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    @Override
    public String toString() {
        return "productHibernate[" +
                "prodId=" + prodId +
                ", prodName=" + prodName  +
                ", prodDescription=" + prodDescription  +
                ", prodType=" + prodType  +
                ", prodPic=" + prodPic  +
                ", numLeft=" + numLeft +
                ", price=" + price +
                ", onSale=" + onSale +
                ']';
    }
}
