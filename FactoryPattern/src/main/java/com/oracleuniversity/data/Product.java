package com.oracleuniversity.data;

import java.math.BigDecimal;

/**
 *
 * @author lilith
 */
public class Product {
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
    private int id;
    private String name;
    private BigDecimal price;
    private Rating rating;
    
    public Product(){
        this(0, "no name", BigDecimal.ZERO);
    }

    public Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product(int id, String name, BigDecimal price) {
        this(id, name, price, Rating.NOT_RATED);
    }

    public static BigDecimal getDISCOUNT_RATE() {
        return DISCOUNT_RATE;
    }

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
    public String toString(){
        return id+", "+name+", "+price+", "+rating.getStars();
    }
    
    
    
}
