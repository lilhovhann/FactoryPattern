package com.oracleuniversity.data;

import java.math.BigDecimal;

/**
 *
 * @author user
 */
public class Drink extends Product {

    public Drink(int id, String name, BigDecimal price, Rating rating) {
        super(id, name, price, rating);
    }
    
}
