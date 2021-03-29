package com.oracleuniversity.data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author lilith
 */
public final class Food extends Product {

    private LocalDate bestBefore;

    public LocalDate getBestBefore() {
        return bestBefore;
    }

     Food(LocalDate bestBefore, int id, String name, BigDecimal price, Rating rating) {
        super(id, name, price, rating);
        this.bestBefore = bestBefore;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + bestBefore;
    }

    @Override
    public BigDecimal getDiscount() {
        return (bestBefore.isEqual(LocalDate.now()))
                ? super.getDiscount() : BigDecimal.ZERO;
    }

    @Override
    public Product applyRating(Rating newRating) {
       return new Food(bestBefore, getId(), getName(), getPrice(), newRating);
    }
    
    

}
