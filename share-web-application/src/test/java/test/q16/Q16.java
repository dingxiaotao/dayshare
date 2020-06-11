package test.q16;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * @author dingxiaotao
 * @date 2020/5/31
 */
public class Q16{

    public static void main(String[] args) {
        Double d = new Double("17.46d");
        Boolean b = new Boolean("false");
        Float f = new Float(23.43);
//        Integer i = Integer.parseUnsignedInt(4);
//        Character c = new Character("c");
        System.out.println(d);
        System.out.println(b);
        System.out.println(f);

        // getdogresult
        List<String> list = Arrays.asList("dog", "over","good");

        System.out.println(list.stream().reduce(new String(),  (s1,s2 )->{if(s1.equals("dog")) return s1; return s2;}));

        list.stream().reduce((x1, x2) ->x1.length() == 3? x1:x2).ifPresent(System.out::println);

        System.out.println(list.stream().reduce(new String(), (s1, s2) -> s1 +s2.charAt(0), (c1, c2) -> c1+=c2));


    }
}
