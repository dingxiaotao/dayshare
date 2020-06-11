package function;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * consumer(消费型)
 * supplier(供给型)
 * predicate(谓词型)
 * function(功能性)
 * @author dingxiaotao
 * @date 2020/6/11
 */
public class ServiceFunction {
    public static void main(String[] args) {
//        ConsumerCode consumerCode = new ConsumerCode();
//        consumerCode.testConsumer();

//        SupplierCode supplierCode = new SupplierCode();
//        supplierCode.testSupplier();

//        PredicateCode predicateCode = new PredicateCode();
//        predicateCode.testPredicate();

        FunctionCode functionCode = new FunctionCode();
        functionCode.testFunction();
    }


}
