package com.xiazeyu.core.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * 单张扑克
 */
@Data
@ToString
@AllArgsConstructor
public class SinglePoker implements Comparable<SinglePoker> {

    private int point;

    private String color;

    @Override
    public int compareTo(SinglePoker o) {
        return this.point - o.point;
    }
}
