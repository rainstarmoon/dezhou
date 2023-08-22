package com.xiazeyu.dezhou.game.core.bean.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 点数
 */
@Getter
@AllArgsConstructor
public enum Point {

    two(2, 2),
    three(3, 3),
    four(4, 4),
    five(5, 5),
    six(6, 6),
    seven(7, 7),
    eight(8, 8),
    nine(9, 9),
    ten(10, 10),
    eleven(11, 11),
    twelve(12, 12),
    thirteen(13, 13),
    one(1, 14);

    private final int code;
    private final int value;
}
