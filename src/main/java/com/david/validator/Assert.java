package com.david.validator;

import com.david.utils.RRException;
import org.apache.commons.lang.StringUtils;

/**
 * 数据校验
 * Created by chendawei on 2017/6/6.
 */
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new RRException (message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new RRException(message);
        }
    }
}
