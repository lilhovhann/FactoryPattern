package com.oracleuniversity.factorypattern;

import com.oracleuniversity.data.Drink;
import com.oracleuniversity.data.Food;
import com.oracleuniversity.data.Product;
import com.oracleuniversity.data.ProductManager;
import com.oracleuniversity.data.Rating;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author lilith
 */
public class Shop {

    public static void main(String[] args) {
        
        ProductManager pm = new ProductManager();
        
        
        Product p1 = pm.createProduct(1, "Tea", BigDecimal.valueOf(200), Rating.THREE_STAR);
        Product p2 = pm.createProduct(2, "Coffee", BigDecimal.valueOf(250), Rating.FOUR_STAR);
        Product p3 = pm.createProduct(LocalDate.now(), 3, "Peanut Butter", BigDecimal.valueOf(1800), Rating.FIVE_STAR);
        Product p5 = pm.createProduct(LocalDate.now(), 4, "Choccolate", BigDecimal.valueOf(400), Rating.FOUR_STAR);
        
        Product p6 = p3.applyRating(Rating.THREE_STAR);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
         System.out.println(p6);

    }

}
