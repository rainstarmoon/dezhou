package com.xiazeyu.dezhou.game.core.aggregate;

import com.xiazeyu.dezhou.game.core.rule.Level;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 牌库
 */
public class PokerLibrary {

    private static final Set<ShapingPoker> poker_library = new HashSet<>();

    private static final Map<Level, Map<ShapingPoker, Integer>> library = new HashMap<>();

    static {
        for (Level value : Level.values()) {


        }
    }


}
