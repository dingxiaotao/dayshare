package test.q7;

import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

/**
 * @author dingxiaotao
 * @date 2020/5/31
 */
public class Q7 {
    public static void main(String[] args) {
        YearMonth ym1 = YearMonth.now();
        YearMonth ym2 = YearMonth.of(2016, Month.FEBRUARY);
        System.out.println(ym2.until(ym1, ChronoUnit.MONTHS));
        System.out.println(ym2.compareTo(ym1));
        System.out.println(ym1.minus(Period.ofMonths(4)).getMonthValue());
        System.out.println(ym1.until(ym2, ChronoUnit.MONTHS));

        int x= 5;
        x+=3;
    
        x =x >>1;
        x =~x;

    }
}
