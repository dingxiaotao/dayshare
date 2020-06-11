package test;

/**
 * @author dingxiaotao
 * @date 2020/5/31
 */
public class Child extends Parent {
    public Child() {
        count++;
    }

    public static void main(String[] args) {
        System.out.println("count =" + getCount());
        Child obj = new Child();
        System.out.println("Count = "+ getCount());
    }
}
