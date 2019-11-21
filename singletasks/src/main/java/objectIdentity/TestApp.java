package objectIdentity;

import java.util.HashMap;
import java.util.Map;

public class TestApp {

    public static void main(String[] args) {
//        Cat cat1 = new Cat("susie", 3);
//        Cat cat2 = new Cat("Lester", 5);
//        Cat cat3 = new Cat("Lili", 1);
//
//        Map<Cat, String> catOwnerMap = new HashMap<>();
//
//        catOwnerMap.put(cat1, "Bartek");
//        catOwnerMap.put(cat2, "Ania");
//        catOwnerMap.put(cat3, "Ola");
//
//        System.out.println(cat1.hashCode());
//        System.out.println(cat2.hashCode());
        Cat cat1 = new Cat("susie", 3);
        Cat cat2 = new Cat("susie", 3);

        System.out.println(cat1.equals(cat2));

        Map<Cat, String> catOwnerMap = new HashMap<>();
        catOwnerMap.put(cat1, "value1");
        catOwnerMap.put(cat2, "value2");

        System.out.println(catOwnerMap.get(cat1));
        System.out.println(catOwnerMap.get(cat2));

    }
}
