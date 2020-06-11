package test.q6;

import jdk.nashorn.internal.runtime.options.Options;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * @author dingxiaotao
 * @date 2020/5/31
 */
public class Q6 {
    public static void main(String[] args) {
        String a = null;
        Optional<String> b = Optional.empty();
        try {
            System.out.println(a.length());
            System.out.println(b.orElse("").length());
        }
        catch (Exception e) {
            System.out.println(a);
        }
        finally {
            a = "String";
            System.out.println(a.length());
            b = Optional.ofNullable("");
            System.out.println(b.get().length());
        }
    }
}
