package design.patterns.singleton;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();

        System.out.println(hungrySingleton);

        String s = JSON.toJSONString(hungrySingleton);

        HungrySingleton hungrySingleton2 = JSON.parseObject(s, HungrySingleton.class);
        System.out.println(hungrySingleton2);


        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        System.out.println(enumSingleton);

        String s2 = JSON.toJSONString(enumSingleton);


        EnumSingleton enumSingleton1 = JSON.parseObject(s2, EnumSingleton.class);
        System.out.println(enumSingleton1);


        StaticInnerSingleton staticInnerSingleton = StaticInnerSingleton.getInstance();

        System.out.println(staticInnerSingleton);

        String s1 = JSON.toJSONString(staticInnerSingleton);

        StaticInnerSingleton staticInnerSingleton1 = JSON.parseObject(s1, StaticInnerSingleton.class);
        System.out.println(staticInnerSingleton1);
    }
}
