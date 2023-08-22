package com.xiazeyu.dezhou.game.core.aggregate;

import com.xiazeyu.dezhou.game.core.bean.Poker;
import lombok.Data;

import java.util.List;

/**
 * 手牌
 * 2张
 */
@Data
public class HandPoker {

    private List<Poker> list;
}
