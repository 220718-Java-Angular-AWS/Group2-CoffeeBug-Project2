package daos;
import javax.persistence.*;
@Entity
@Table(name = "ratings")
public class ratingHibernate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="rating_id")
    private Integer ratingId;

    @Column(name="prod_id")
    private Integer prodId;

    @Column(name="rating")
    private double rating;

    @Column(name="comment")
    private String comment;

    public ratingHibernate() {
    }

    public ratingHibernate(Integer ratingId, Integer prodId, double rating, String comment) {
        this.ratingId = ratingId;
        this.prodId = prodId;
        this.rating = rating;
        this.comment = comment;
    }

    public Integer getRatingId() {
        return ratingId;
    }

    public void setRatingId(Integer ratingId) {
        this.ratingId = ratingId;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "ratingHibernate{" +
                "ratingId=" + ratingId +
                ", prodId=" + prodId +
                ", rating=" + rating +
                ", comment='" + comment + '\'' +
                '}';
    }
}
