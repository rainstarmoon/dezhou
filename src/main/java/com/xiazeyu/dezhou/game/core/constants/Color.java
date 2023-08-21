package com.xiazeyu.dezhou.game.core.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Color {

    spade("黑桃"),
    heart("红桃"),
    diamond("方块"),
    club("梅花");

    private final String desc;
}
