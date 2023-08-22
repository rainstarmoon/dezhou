package com.xiazeyu.dezhou.game.core.library;

import com.xiazeyu.dezhou.game.core.aggregate.ShapingPoker;
import com.xiazeyu.dezhou.game.core.bean.Poker;
import com.xiazeyu.dezhou.game.core.rule.Level;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 牌库
 */
public class PokerLibrary {

    /**
     * 全牌组合
     */
    private static final List<Poker> poker_library = new ArrayList<>();

    /**
     * 全成牌组合
     */
    private static final List<ShapingPoker> shaping_poker_library = new ArrayList<>();

    /**
     * 分类成牌组合
     */
    private static final Map<Level, Map<ShapingPoker, Integer>> level_shaping_poker_library = new HashMap<>();


}
