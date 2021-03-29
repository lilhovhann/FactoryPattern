package com.oracleuniversity.data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author lilith
 */
public class ProductManager {
    public Product createProduct(LocalDate bestBefore, int id, String name, BigDecimal price, Rating rating){
        return new Food(bestBefore, id, name, price, rating);
    }
    
    public Product createProduct(int id, String name, BigDecimal price, Rating rating){
        return new Drink( id, name, price, rating);
    }
    
    
}
