package entities;

import java.util.Objects;

public class Product {
    private Integer prodId;
    private String prodName;
    private String prodDescription;
    private String prodType;
    private String prodPic;
    private Integer numLeft;
    private Float price;
    private boolean onSale;

    public Product() {
    }

    public Product(Integer prodId, String prodName, String prodDescription, String prodType, String prodPic, Integer numLeft, Float price, boolean onSale) {
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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return onSale == product.onSale && Objects.equals(prodId, product.prodId) && Objects.equals(prodName, product.prodName) && Objects.equals(prodDescription, product.prodDescription) && Objects.equals(prodType, product.prodType) && Objects.equals(prodPic, product.prodPic) && Objects.equals(numLeft, product.numLeft) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prodId, prodName, prodDescription, prodType, prodPic, numLeft, price, onSale);
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", prodDescription='" + prodDescription + '\'' +
                ", prodType='" + prodType + '\'' +
                ", prodPic='" + prodPic + '\'' +
                ", numLeft=" + numLeft +
                ", price=" + price +
                ", onSale=" + onSale +
                '}';
    }
}
