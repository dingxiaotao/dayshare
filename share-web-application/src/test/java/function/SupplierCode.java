package function;

import jdk.nashorn.internal.runtime.options.Options;

import java.util.Random;
import java.util.function.Supplier;

/**
 * Supplier 接口是一个供给型的接口，其实，说白了就是一个容器，可以用来存储数据，然后可以供其他方法使用的这么一个接口
 * @author dingxiaotao
 * @date 2020/6/11
 */
public class SupplierCode {

    public void testSupplier() {
        // 1.使用接口实现方法
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return new Random().nextInt();
            }
        };

        System.out.println(supplier.get());
        System.out.println("*************************");

        // 2.使用lamda表达式
        supplier = () -> new Random().nextInt();
        System.out.println(supplier.get());
        System.out.println("********************");

        // 3.方法引用
        Supplier<Double> supplier2 = Math::random;
        System.out.println(supplier2.get());
    }
}
