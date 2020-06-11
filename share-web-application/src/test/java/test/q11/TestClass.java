package test.q11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author dingxiaotao
 * @date 2020/5/31
 */
public class TestClass {
    public static void main(String[] args) {
//        System.out.println(Q11.E1);
//        System.out.println("%s,%s,%s", Q11[1], Q11[1].s1, Q11[1].s2);
//        System.out.println("%s,%s,%s", Q11.E1.toString(), Q11.E1.s1(), Q11.E1.s2());
//        System.out.println("%s,%s,%s", Q11.E1, Q11.E1.s1(), Q11.E1.s2());
//
//        BufferedReader is = new BufferedReader(new FileReader(""));

    List<String> names = Arrays.asList("Jupiter","Neptune","Mars", "Earth");
        Map<Integer, List<String>> nameList = names.stream().collect(Collectors.groupingBy(p -> p.length()));
        nameList.forEach((l, s) -> System.out.println());

    }

//    public int getClient(List<? implements Number> param) {
//        return 0;
//    }
}
