package test.q12;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dingxiaotao
 * @date 2020/5/31
 */
public class Q12 {
    public List<String> queueSequence;
    public void setUp() {
        try {
            e();
        } finally {
            c();
            System.out.println("quenece success");
        }
    }
        private void c() {
            if (queueSequence.size()>0) {
                System.out.println("size >0");
            }
        }
        private void e() {
        if (true) {
            throw new IllegalArgumentException();
        }
        queueSequence = new ArrayList<>();
        }
}
