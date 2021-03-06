package com.oracleuniversity.data;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Objects;

/**
 *
 * @author lilith
 */
public abstract class Product {

    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
    private int id;
    private String name;
    private BigDecimal price;
    private Rating rating;


     Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

     Product(int id, String name, BigDecimal price) {
        this(id, name, price, Rating.NOT_RATED);
    }

    public static BigDecimal getDISCOUNT_RATE() {
        return DISCOUNT_RATE;
    }
    
    public BigDecimal getDiscount(){
        return price.multiply(DISCOUNT_RATE);
    }
    
    public abstract Product applyRating(Rating newRating);

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Rating getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + price + ", " + rating.getStars();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Product) {
            final Product other = (Product) obj;
            return this.id == other.id && Objects.equals(this.name, other.name);
        }
        return false;
    }
    
    

}
