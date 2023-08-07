package com.xiazeyu.core.data;

import lombok.Data;

import java.util.List;

/**
 * 公共牌
 */
@Data
public class CommonPoker {

    private List<SinglePoker> fanpai;

    private SinglePoker zhuanpai;

    private SinglePoker hepai;

}
