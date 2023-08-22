package com.xiazeyu.dezhou.game.core.bean.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 花色
 */
@Getter
@AllArgsConstructor
public enum Color {

    spade(1, "黑桃"),
    heart(2, "红桃"),
    diamond(3, "方块"),
    club(4, "梅花");

    private final int value;
    private final String desc;
}
