package test.q15;

/**
 * @author dingxiaotao
 * @date 2020/5/31
 */
public class MathOperation {
    public static int calculate(String choice, int a, int b) {
        int c= 3;
        switch (choice) {
            case"ADD": c+=a+b;
            case "SUBTRACT" : c+=a-b;
            default: c+=a*b;
        }
        return c;
    }
}
