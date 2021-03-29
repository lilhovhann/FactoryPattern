package com.oracleuniversity.data;

/**
 *
 * @author lilith
 */
public enum Rating {
    NOT_RATED("not rated"),
    ONE_STAR("1 star"),
    TWO_STAR("2 star"),
    THREE_STAR("3 star"),
    FOUR_STAR("4 star"),
    FIVE_STAR("5 star");
    
    private String stars;

    private Rating(String stars) {
        this.stars = stars;
    }

    public String getStars() {
        return stars;
    }
    
    
    
    
}
