package com.xiazeyu.dezhou.game.core.rule;

import com.xiazeyu.dezhou.game.core.aggregate.ShapingPoker;
import com.xiazeyu.dezhou.game.core.bean.Poker;
import com.xiazeyu.dezhou.game.core.bean.enums.Point;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum Level {

    /**
     * 都一样大
     */
    royal_flush(10, "皇家同花顺"),
    /**
     * 比较最高张大小
     */
    straight_flush(9, "同花顺"),
    /**
     * 比较4条大小
     */
    four_of_a_kind(8, "四条"),
    /**
     * 比较三条大小
     */
    full_house(7, "葫芦"),
    /**
     * 比较最高张大小 -> 比较第2高张大小 -> 比较第3高张大小 -> 比较第4高张大小 -> 比较第5高张大小
     */
    flush(6, "同花"),
    /**
     * 比较最高张大小
     */
    straight(5, "顺子"),
    /**
     * 比较三条大小
     */
    three_of_a_kind(4, "三条"),
    /**
     * 比较最高对大小 -> 比较第2高对大小 -> 比较单张大小
     */
    two_pairs(3, "两对"),
    /**
     * 比较对子大小 -> 比较最高张大小 -> 比较第2高张大小 -> 比较第3高张大小
     */
    one_pair(2, "一对"),
    /**
     * 比较最高张大小 -> 比较第2高张大小 -> 比较第3高张大小 -> 比较第4高张大小 -> 比较第5高张大小
     */
    high_card(1, "高牌");

    private final int value;
    private final String desc;

    public static Level formatLevel(ShapingPoker shapingPoker) {
        List<Poker> list = shapingPoker.getList();
        Map<Point, List<Poker>> pointPokerMap = new HashMap<>();


        return null;
    }

}
