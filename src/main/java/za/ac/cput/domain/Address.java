package za.ac.cput.domain;

import java.util.Objects;

public class Address {
    private String number;
    private String street;
    private String city;
    private String region;
    private String zipCode;

    public Address() {
    }

    public Address(String number, String street, String city, String region, String zipCode) {
        this.number = number;
        this.street = street;
        this.city = city;
        this.region = region;
        this.zipCode = zipCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Address address = (Address) object;
        return java.util.Objects.equals(number, address.number) && java.util.Objects.equals(street, address.street) && java.util.Objects.equals(city, address.city) && java.util.Objects.equals(region, address.region) && java.util.Objects.equals(zipCode, address.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), number, street, city, region, zipCode);
    }

    @Override
    public java.lang.String toString() {
        return "Address{" +
                "number='" + number + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
