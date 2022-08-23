package daos;
import javax.persistence.*;
@Entity
@Table(name = "product")

public class productHibernate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_id");
    private Integer prodId;
    @Column(name = "prod_name");
    private String prodName;
    @Column(name = "prod_description");
    private String prodDescription;
    @Column(name = "prod_type");
    private String prodType;
    @Column(name = "prod_pic");
    private String prodPic;
    @Column(name = "num_left");
    private Integer numLeft;
    @Column(name = "price");
    private float price;
    @Column(name = "on_sale");
    private boolean onSale;



}
