package com.david.annotation;

import java.lang.annotation.*;

/**
 * 系统日志注解
 * Created by chendawei on 2017/6/6.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {

    String value() default "";
}