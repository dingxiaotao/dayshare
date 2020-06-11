package suanfa;

/**
 * @author dingxiaotao
 * @date 2020/6/10
 */

import java.util.*;
public class EightNumMake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            for(int i=0; i<n; i++) {
                String temp = sc.next();
                while(temp.length()%8!=0) {
                    temp += "0";
                }
                for(int j=0; j<temp.length(); j+=8) {
                    System.out.println(temp.substring(j, j+8));
                }
            }
        }
    }
}
