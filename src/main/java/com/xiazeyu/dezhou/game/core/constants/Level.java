package com.xiazeyu.dezhou.game.core.constants;

import com.xiazeyu.dezhou.game.core.aggregate.ShapingPoker;
import com.xiazeyu.dezhou.game.core.bean.Poker;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum Level {

    royal_flush(10),
    straight_flush(9),
    four_of_a_kind(8),
    full_house(7),
    flush(6),
    straight(5),
    three_of_a_kind(4),
    two_pairs(3),
    one_pair(2),
    high_card(1);

    private final int value;

    public static Level formatLevel(ShapingPoker shapingPoker) {

        shapingPoker.getList().sort(null);

        System.out.println(shapingPoker.getList());


        return null;
    }


//    public static boolean isLarge(ShapingPoker shapingPoker1, ShapingPoker shapingPoker2) {
//
//
//    }

    public static void main(String[] args) {
        ShapingPoker shapingPoker = new ShapingPoker();
        List<Poker> list = new ArrayList<>();
        list.add(new Poker(1, null));
        list.add(new Poker(2, null));
        list.add(new Poker(3, null));
        list.add(new Poker(4, null));
        list.add(new Poker(5, null));
        shapingPoker.setList(list);
        formatLevel(shapingPoker);

    }

}
