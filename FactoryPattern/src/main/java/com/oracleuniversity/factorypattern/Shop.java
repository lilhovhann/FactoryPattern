package com.oracleuniversity.factorypattern;

import com.oracleuniversity.data.Drink;
import com.oracleuniversity.data.Food;
import com.oracleuniversity.data.Product;
import com.oracleuniversity.data.Rating;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author lilith
 */
public class Shop {

    public static void main(String[] args) {
        Product p1 = new Product(1, "Tea", BigDecimal.valueOf(200));
        Product p2 = new Drink(2, "Coffee", BigDecimal.valueOf(250), Rating.FOUR_STAR);
        Product p3 = new Food(LocalDate.now(), 3, "Peanut Butter", BigDecimal.valueOf(1800), Rating.FIVE_STAR);

        Product p4 = new Drink(4, "Choccolate", BigDecimal.valueOf(400), Rating.FOUR_STAR);
        Product p5 = new Food(LocalDate.now(), 4, "Choccolate", BigDecimal.valueOf(400), Rating.FOUR_STAR);
        System.out.println(p4.equals(p5));
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }

}
