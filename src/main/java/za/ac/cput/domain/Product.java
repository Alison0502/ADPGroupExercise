package za.ac.cput.domain;

import java.util.Objects;

public class Product {
    private String prodName;
    private String prodCode;
    private String prodDescription;
    private String price;

    public Product() {
    }

    public Product(String prodName, String prodCode, String prodDescription, String price) {
        this.prodName = prodName;
        this.prodCode = prodCode;
        this.prodDescription = prodDescription;
        this.price = price;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public String getProdDescription() {
        return prodDescription;
    }

    public void setProdDescription(String prodDescription) {
        this.prodDescription = prodDescription;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(prodName, product.prodName) && Objects.equals(prodCode, product.prodCode) && Objects.equals(prodDescription, product.prodDescription) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prodName, prodCode, prodDescription, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodName='" + prodName + '\'' +
                ", prodCode='" + prodCode + '\'' +
                ", prodDescription='" + prodDescription + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
