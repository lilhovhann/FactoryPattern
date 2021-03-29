package com.oracleuniversity.data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author lilith
 */
public class Food extends Product {
    
    private LocalDate bestBefore;

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public Food(LocalDate bestBefore, int id, String name, BigDecimal price, Rating rating) {
        super(id, name, price, rating);
        this.bestBefore = bestBefore;
    }
    
     

}
