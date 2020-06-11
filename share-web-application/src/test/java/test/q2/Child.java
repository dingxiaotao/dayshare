package test.q2;

/**
 * @author dingxiaotao
 * @date 2020/5/31
 */
public class Child  {

    static class Parent {
        private int count = 5;
        public void bump(int inc) {
            inc ++;
            count = count +inc;
        }
    }
    public static void main(String[] args) {
        Parent obj = new Parent();
        int data = 2;
        obj.bump(data);
        System.out.println(obj.count +"Count = "+ data);
    }
}
