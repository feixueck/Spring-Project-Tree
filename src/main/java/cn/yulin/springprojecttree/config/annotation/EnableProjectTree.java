package cn.yulin.springprojecttree.config.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface EnableProjectTree {
    String value() default "";
}
