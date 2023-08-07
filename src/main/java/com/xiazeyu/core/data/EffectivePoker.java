package com.xiazeyu.core.data;

import lombok.Data;

import java.util.List;

/**
 * 最终牌
 */
@Data
public class EffectivePoker {

    private List<SinglePoker> list;

    public List<SinglePoker> orderPoker() {
        list.sort(null);
        if (list.get(0).getPoint() == 1
                && list.get(1).getPoint() == 2
                && list.get(2).getPoint() == 3
                && list.get(3).getPoint() == 4
                && list.get(4).getPoint() == 5
        ) {
            return list;
        }
        if (list.get(0).getPoint() == 1) {
            SinglePoker remove = list.remove(0);
            remove.setPoint(14);
            list.add(remove);
        }
        return list;
    }


}
