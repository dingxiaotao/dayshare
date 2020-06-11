package service;

import ch.qos.logback.core.net.SyslogOutputStream;
import dto.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author dingxiaotao
 * @date 2020/5/28
 */

@AllArgsConstructor
@Service
public class LamdaService {

    public void testLambda() {
//        this.stearmUseable();
        this.filterSteam();
//        this.sortSteam();
//        this.skipSteam();
//        this.flatMapSteam();
//        this.matchSteam();
//        this.findSteam();
//        this.reduceSteam();
//        this.dataSteam();
    }

    /*
     * 流的可见性
     */
    private void stearmUseable() {
        String[] fruit = new String[] {"apple", "pear", "orange", "banana"};
        List<String> list = Arrays.asList(fruit);
        List<String> changeList = new ArrayList<>();
        changeList.addAll(list);

        Stream<String> stringStream = list.stream().limit(3).sorted();
        List<String> resultString = stringStream.collect(Collectors.toList());
        System.out.println("getTreeFriutBySort :" + resultString.toString());
        // 下面语句报错，因为流只能消费一次
        //List<String> resultString2 = stringStream.collect(Collectors.toList());

    }

    private void filterSteam() {
        List<User> uses = getUser();
        // distinct 用于去除重复元素
        List<String> userName = uses.stream().filter(u -> u.getAge() > 10).map(User::getName).distinct().collect(Collectors.toList());
        System.out.println("filter result:" + userName);

        // 用于去除map的重复的key的值
//        Map<String, Object> nameAgeWrong = uses.stream().collect(Collectors.toMap(User::getName, User::getAge));
//        System.out.println("wrong"+nameAgeWrong.toString());
        Map<String, Object> nameAge = uses.stream().collect(Collectors.toMap(c -> c.getName(), c -> c.getAge(), (c1, c2) -> c1));
        System.out.println("right"+nameAge.toString());

   }

    private void sortSteam() {
        List<User> uses = getUser();
//        uses = uses.stream().sorted((p1, p2) -> p1.getAge() - p2.getAge()).collect(Collectors.toList());
        uses = uses.stream().sorted(Comparator.comparingInt(User::getAge)).collect(Collectors.toList());
        System.out.println("sort result = " + uses);
    }

    private void skipSteam() {
        List<User> users = getUser();
        users = users.stream().skip(2).collect(Collectors.toList());
        System.out.println("skip result = " + users.toString());
    }

    private void flatMapSteam() {
        List<String> list = new ArrayList<>();
        list.add("aaa bbb ccc");
        list.add("eee bbb fff");
        list.add("ggg bbb ttt");
        // 生成流
        list = list.stream().map(s -> s.split(" ")).flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println("flat map result:"+ list.toString());
    }

    private void matchSteam() {
        List<User> users = getUser();
        // anymatch
        Boolean result = users.stream().anyMatch(u -> "harry".equals(u.getName()));
        System.out.println("anymatch result" + result);
        // allmatch
        Boolean allMatchResult = users.stream().allMatch(u -> u.getAge() < 25);
        System.out.println("all match result" + allMatchResult);
        // noneMatch
        Boolean noneMatchResult = users.stream().noneMatch(u -> "jack".equals(u.getName()));
        System.out.println("none match result" + noneMatchResult);
    }

    private void findSteam() {
        List<User> users = getUser();
        Optional<User> user = users.stream().filter(u -> "jack".equals(u.getName())).findAny();
        System.out.println("findanyResult= " + user.get().getAge());
        Optional<User> user1 = users.stream().filter(u -> "harry".equals(u.getName())).findFirst();
        System.out.println("findFirstResult " + (user1.isPresent() ?user1.get().getAge() : "none"));
    }

    private void reduceSteam() {
        // 组合元素 进行运算
        List<User> users = getUser();
//        Integer ageSum = users.stream().map(User::getAge).reduce(0, (a, b) -> a + b);
        // 0为起始值
        Integer ageSum = users.stream().map(User::getAge).reduce(0, Integer::sum);
        System.out.println("sum age =" + ageSum);

        Optional<Integer> age = users.stream().map(User::getAge).reduce(Integer::sum);
        System.out.println("sum age1=" + age.get() );

        Long count = users.stream().count();
        System.out.println("count=" + count);
    }

    private void dataSteam() {
        List<User> users = getUser();
        IntStream result = users.stream().mapToInt(User::getAge);
        System.out.println("agesum=" + result.sum());
        IntStream result2 = users.stream().mapToInt(User::getAge);
        System.out.println("ageAve=" + result2.average());
        int[] intNum = {1,3,2};
        Stream<String> stringStream = Stream.of("ding","xiao","tao");
        List<String> stringList = stringStream.collect(Collectors.toList());
//        IntStream stringStream1 = Arrays.stream(intNum,4,5);
        System.out.println("stringSteam=" + stringList.toString());
//        System.out.println("stringSteam1=" + stringStream1.toString());

        // 获取文件流
        try {
            Stream<String> stream = Files.lines(Paths.get("C:\\Users\\dingxiaotao\\Desktop\\2980邮箱注册.txt"));
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private List<User> getUser() {
        List<User> users = new ArrayList<>();
        users.add(User.builder().age(15).name("harry").build());
        users.add(User.builder().age(9).name("potter").build());
        users.add(User.builder().age(21).name("jack").build());
        users.add(User.builder().age(20).name("jack").build());
        return users;
    }
}
