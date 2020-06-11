package function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Function 接口是一个功能型接口，它的一个作用就是转换作用，将输入数据转换成另一种形式的输出数据。
 * @author dingxiaotao
 * @date 2020/6/11
 */
public class FunctionCode {

    public void testFunction() {
        // 1,使用Map方法 泛型的第一个参数是转换前的类型，第二个是转化后的类型
        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        Stream<String> stream = Stream.of("aab", "bb0113","cnn14");
        stream.map(function).forEach(System.out::println);

    }
}
