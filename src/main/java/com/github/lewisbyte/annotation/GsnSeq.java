package com.github.lewisbyte.annotation;

import java.lang.annotation.*;

/**
 * 生成流水注解
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GsnSeq {
}
