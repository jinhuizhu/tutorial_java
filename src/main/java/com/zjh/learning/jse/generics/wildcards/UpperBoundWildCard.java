package com.zjh.learning.jse.generics.wildcards;

import java.util.List;

/**
 * Created by jinhui on 10/7/2016.
 */
public class UpperBoundWildCard {

    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list)
            s += n.doubleValue();
        return s;
    }
}
