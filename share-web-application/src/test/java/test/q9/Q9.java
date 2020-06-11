package test.q9;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author dingxiaotao
 * @date 2020/5/31
 */
public class Q9 {
    public static void main(String[] args) {
        Supplier<String> i = () -> "Car";
        Consumer<String> c = x -> System.out.println(x.toLowerCase());
        Consumer<String>d = x -> System.out.println(x.toUpperCase());
        c.andThen(d).accept(i.get());
        System.out.println();
    }
}
