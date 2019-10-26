package level3;

import java.util.HashMap;
import java.util.TreeSet;

public class look {
    public look(String name, TreeSet<Integer> set, HashMap<Integer, String> map) {
        System.out.println(name + "的牌是：");
        for (Integer i : set) {
            System.out.print(map.get(i) + " ");
        }
        System.out.println();
    }
}


