package test.q11;

/**
 * @author dingxiaotao
 * @date 2020/5/31
 */
public enum Q11 {
    E1("H1","G1"),
    E2("H2","G2");
    private String s1;
    private String s2;
    private Q11(String s1, String s2) {
        s1 = s1;
        s2 = s2;
    }
    public String s1() {return s1;}
    public String s2() {return s2;}

}
