package function;

import java.util.Iterator;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * 接口是一个谓词型接口，其实，这个就是一个类似于 bool 类型的判断的接口
 * @author dingxiaotao
 * @date 2020/6/11
 */
public class PredicateCode {
    protected void testPredicate(){
        // 1.使用Predicate接口实现方法
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer > 0) {
                    return true;
                }
                return false;
            }
        };
        System.out.println(predicate.test(1));
        System.out.println("********************");
        // 2.使用lamda表达式
        predicate = (t) -> t > 5;
        System.out.println(predicate.test(4));
        System.out.println(predicate.test(6));
        System.out.println("******************");
        // 3.结合stream
        Stream<Integer> stream = Stream.of(1,5,7,-1,-3,9,10);
        stream.filter(predicate).forEach((s) -> System.out.println(s));

    }
}
