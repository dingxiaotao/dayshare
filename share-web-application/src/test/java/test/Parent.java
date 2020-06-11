package test;

/**
 * @author dingxiaotao
 * @date 2020/5/31
 */
public class Parent {
    static int count = 0;
    public Parent() {
        count++;
    }
    static int getCount() {return count;}
}
