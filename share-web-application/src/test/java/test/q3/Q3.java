package test.q3;

import function.PredicateCode;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author dingxiaotao
 * @date 2020/5/31
 */
public class Q3 {
    public static void main(String[] args) {
        System.out.println(Stream.of("green", "yellow", "blue").max((s1, s2) -> s1.compareTo(s2)).filter(s -> s.endsWith("n")).orElse("yellow"));
    }
}
