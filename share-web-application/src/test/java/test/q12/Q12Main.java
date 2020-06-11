package test.q12;

import java.util.Scanner;

/**
 * @author dingxiaotao
 * @date 2020/5/31
 */
public class Q12Main {
    public static void main(String[] args) {
//        Q12  q12 = new Q12();
//        q12.setUp();
//        System.out.println("complete");

        StringBuilder sb = new StringBuilder();
        for (String arg : args) {
            if (sb.indexOf(arg) < 1) {

            }
            System.out.println(sb.toString());
            Scanner sc = new Scanner(sb.toString());
            while (sc.hasNext()) {
                if (sc.hasNextInt()){
                    System.out.println(sc.nextInt() + "");
                }
                else sc.next();
            }
        }

    }
}
