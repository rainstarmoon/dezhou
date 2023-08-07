package com.xiazeyu.core.rule;

import com.xiazeyu.core.data.EffectivePoker;
import com.xiazeyu.core.data.SinglePoker;

import java.util.List;

public class PokerRule {


    /**
     * 比较大小
     * 牌力level
     * 1、同花顺，比较最高张大小
     * 2、4条，比较4条大小 -> 比较单张大小
     * 3、3条 + 1对，比较3条大小 -> 比较1对大小
     * 4、同花，比较最高张大小 -> 比较第2高张大小 -> 比较第3高张大小 -> 比较第4高张大小 -> 比较第5高张大小
     * 5、顺子，比较最高张大小
     * 6、三条，比较3条大小 -> 比较最高张大小 -> 比较第2高张大小
     * 7、两对，比较最高对大小 -> 比较第2高对大小 -> 比较单张大小
     * 8、一对，比较对子大小 -> 比较最高张大小 -> 比较第2高张大小 -> 比较第3高张大小
     * 9、单张，比较最高张大小 -> 比较第2高张大小 -> 比较第3高张大小 -> 比较第4高张大小 -> 比较第5高张大小
     *
     * @param effectivePoker1
     * @param effectivePoker2
     * @return
     */
    public static boolean isLarge(EffectivePoker effectivePoker1, EffectivePoker effectivePoker2) {
        List<SinglePoker> singlePokers1 = effectivePoker1.orderPoker();
        List<SinglePoker> singlePokers2 = effectivePoker2.orderPoker();
        return false;
    }

}
