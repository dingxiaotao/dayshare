package suanfa;
import java.util.*;
public class StirngReplace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String ss = s.replaceAll("([\\d]+)","*$1*");
            System.out.println(ss);
        }
    }
}