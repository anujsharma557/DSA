package main.java.com.dsa;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundOff{
    public static void main(String [] args){
        BigDecimal value=BigDecimal.valueOf(-1.934);
        BigDecimal new_Val=value.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("new:"+new_Val);
    }
}
