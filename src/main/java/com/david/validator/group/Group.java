package com.david.validator.group;

import javax.validation.GroupSequence;

/**
 * 定义校验顺序，如果AddGroup组失败，则UpdateGroup组不会再校验
 * Created by chendawei on 2017/6/6.
 */
@GroupSequence({AddGroup.class, UpdateGroup.class})
public interface Group {

}
