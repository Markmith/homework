package level3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class level3 {
    public static void main(String[] args) {
        HashMap<Integer, String> hezi = new HashMap<>();//存放扑克牌和它的索引
        ArrayList<Integer> list = new ArrayList<>();//存放扑克牌的索引

        //生成扑克牌，从小到大存入集合中，这里采取的花色大小是：梅花<方片<黑桃<红桃
        String[] colors = {"♣", "♦", "♠", "♥"};//花色数组
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};//大小数组
        int index = 0;//扑克牌的索引

        //将扑克牌存放进HashMap集合中
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                String puke = colors[j].concat(numbers[i]);
                hezi.put(index, puke);
                list.add(index);
                index++;
            }
        }
        hezi.put(index, "小王");
        list.add(index);
        index++;
        hezi.put(index, "大王");
        list.add(index);
        //洗牌
        Collections.shuffle(list);

        TreeSet<Integer> play1set = new TreeSet<>();//玩家1牌组集合
        TreeSet<Integer> play2set = new TreeSet<>();//玩家2牌组集合
        TreeSet<Integer> play3set = new TreeSet<>();//玩家3牌组集合
        TreeSet<Integer> cardsset = new TreeSet<>();//底牌牌组集合
        //发牌
        for (int i = 0; i < list.size(); i++) {
            if (i >= list.size() - 3) {
                cardsset.add(list.get(i));
            } else if (i % 3 == 0) {
                play1set.add(list.get(i));
            } else if (i % 3 == 1) {
                play2set.add(list.get(i));
            } else {
                play3set.add(list.get(i));
            }
        }

        int d = 0;//d表示地主牌的索引
        while (true) {
            d = (int) (Math.random() * 54);//产生一个0-53之间的随机数，对应着扑克的索引
            if (!cardsset.contains(d)) {//地主牌的索引不是底牌索引
                break;//结束循环
            }
        }
        System.out.println("地主牌为：" + hezi.get(d));

        if (play1set.contains(d)) {
            play1set.addAll(cardsset);
        } else if (play2set.contains(d)) {
            play2set.addAll(cardsset);
        } else {
            play3set.addAll(cardsset);
        }

        //看牌
        new look("玩家1", play1set, hezi);
        new look("玩家2", play2set, hezi);
        new look("玩家3", play3set, hezi);
        new look("底牌", cardsset, hezi);

    }

}


