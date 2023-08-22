package com.xiazeyu.dezhou.game.core.bean;

import com.xiazeyu.dezhou.game.core.bean.enums.Color;
import com.xiazeyu.dezhou.game.core.bean.enums.Point;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Poker implements Comparable<Poker> {

    /**
     * 点数
     */
    private Point point;

    /**
     * 花色
     */
    private Color color;

    /**
     * 从大到小排列
     */
    @Override
    public int compareTo(Poker o) {
        int pointCompare = o.point.getValue() - this.point.getValue();
        if (pointCompare != 0) {
            return pointCompare;
        }
        return o.color.getValue() - this.color.getValue();
    }
}
