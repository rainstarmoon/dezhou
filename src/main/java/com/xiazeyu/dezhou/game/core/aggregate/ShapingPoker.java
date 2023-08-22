package com.xiazeyu.dezhou.game.core.aggregate;

import com.xiazeyu.dezhou.game.core.bean.Poker;
import lombok.Data;

import java.util.List;

/**
 * 成牌
 * 5张
 */
@Data
public class ShapingPoker {

    private List<Poker> list;
}
