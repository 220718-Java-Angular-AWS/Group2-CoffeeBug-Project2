package entities;

import java.util.Objects;

public class Address{
    private Integer addressId;
    private Integer userId;
    private String state;
    private String city;
    private Integer zip;
    private Integer appartment;

    public Address() {
    }

    public Address(Integer addressId, Integer userId, String state, String city, Integer zip, Integer appartment) {
        this.addressId = addressId;
        this.userId = userId;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.appartment = appartment;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public Integer getAppartment() {
        return appartment;
    }

    public void setAppartment(Integer appartment) {
        this.appartment = appartment;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Address)) return false;
        if (!super.equals(object)) return false;
        Address address = (Address) object;
        return java.util.Objects.equals(getAddressId(), address.getAddressId()) && java.util.Objects.equals(getUserId(), address.getUserId()) && java.util.Objects.equals(getState(), address.getState()) && java.util.Objects.equals(getCity(), address.getCity()) && java.util.Objects.equals(getZip(), address.getZip()) && java.util.Objects.equals(getAppartment(), address.getAppartment());
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), getAddressId(), getUserId(), getState(), getCity(), getZip(), getAppartment());
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", userId=" + userId +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", zip=" + zip +
                ", appartment=" + appartment +
                '}';
    }
}
