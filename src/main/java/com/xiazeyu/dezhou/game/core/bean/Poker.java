package com.xiazeyu.dezhou.game.core.bean;

import com.xiazeyu.dezhou.game.core.constants.Color;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Poker implements Comparable<Poker> {

    /**
     * 点数
     */
    private int point;

    /**
     * 花色
     */
    private Color color;

    /**
     * 从大到小排列
     */
    @Override
    public int compareTo(Poker o) {
        return o.point - this.point;
    }
}
